/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pavikumbhar.javaheart.resource;

import com.pavikumbhar.javaheart.model.Person;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

/**
 *
 * @author pavikumbhar
 */
@Path("/gf")
public class UploadFileServiceGF {
    private final String UPLOADED_FILE_PATH = "d:\\";
	
        
        
        @POST
	@Path("/uploadFormParam")
	@Consumes("multipart/form-data")
        @Produces(MediaType.APPLICATION_JSON)
	public void uploadFile(@Context HttpServletRequest request,@Context HttpServletResponse response,
                             @FormParam("file") File file,
                             @FormParam("filename") String filename,
                             @FormParam("firstName") String firstName,
                             @FormParam("lastName") String lastName
        )
                   
    
        {
            
            try{
               
                System.out.println("filename="+filename);
                System.out.println("firstName="+firstName);
                System.out.println("lastName="+lastName);
              
                System.out.println("theFile="+file);

         
        }
        catch(Exception e){
            e.printStackTrace(System.out);
                  
        }
       
        // return status;
        
    }
        
@POST
@Path("/uploadFormDataParam")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.MULTIPART_FORM_DATA)
public Resspose postForm(
    @DefaultValue("true") @FormDataParam("enabled") boolean enabled,
    @FormDataParam("firstName") String firstName,
    @FormDataParam("lastName") String lastName,
    
    @FormDataParam("uploadFile") InputStream file,
    @FormDataParam("uploadFile") FormDataContentDisposition fileDisposition) {
 
    System.out.println(""+firstName);
    System.out.println(""+fileDisposition.getFileName());
    
    writeToFileServer(file,fileDisposition.getFileName());
    
    Resspose resspose=new Resspose();
    resspose.setFlag("1");
    resspose.setMsg("success");
    return resspose;
}

private String writeToFileServer(InputStream inputStream, String fileName)  {
 
        OutputStream outputStream = null;
        String qualifiedUploadFilePath = UPLOADED_FILE_PATH + fileName;
 
        try {
            outputStream = new FileOutputStream(new File(qualifiedUploadFilePath));
            int read = 0;
            byte[] bytes = new byte[1024];
            while ((read = inputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, read);
            }
            outputStream.flush();
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
        finally{
            try {
                //release resource, if any
                outputStream.close();
            } catch (IOException ex) {
            }
        }
        return qualifiedUploadFilePath;
    }

class Resspose{
private String msg;
private String flag;

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public String getFlag() {
            return flag;
        }

        public void setFlag(String flag) {
            this.flag = flag;
        }

}
}        
  
    

