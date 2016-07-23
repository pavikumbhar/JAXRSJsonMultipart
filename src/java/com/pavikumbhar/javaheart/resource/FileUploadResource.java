/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pavikumbhar.javaheart.resource;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.glassfish.jersey.media.multipart.BodyPart;

import org.glassfish.jersey.media.multipart.BodyPartEntity;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataMultiPart;
import org.glassfish.jersey.media.multipart.FormDataParam;

/**
 *
 * @author pavikumbhar
 */
@Path("/upload")
public class FileUploadResource {

    private final String UPLOADED_FILE_PATH = "d:\\";

	@Path("/files")
	@POST
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	public Response uploadFiles(final FormDataMultiPart multiPart) {

		List<FormDataBodyPart> bodyParts = multiPart.getFields("files");
          
		StringBuffer fileDetails = new StringBuffer("");
		/* Save multiple files */
		for (int i = 0; i < bodyParts.size(); i++) {
			BodyPartEntity bodyPartEntity = (BodyPartEntity) bodyParts.get(i).getEntity();
			String fileName = bodyParts.get(i).getContentDisposition().getFileName();
			saveFile(bodyPartEntity.getInputStream(), fileName);
			fileDetails.append(UPLOADED_FILE_PATH + fileName);
		}

		/* Save File 2 */

		BodyPartEntity bodyPartEntity = ((BodyPartEntity) multiPart.getField("file2").getEntity());
		String file2Name = multiPart.getField("file2").getFormDataContentDisposition().getFileName();
		saveFile(bodyPartEntity.getInputStream(), file2Name);
		fileDetails.append(UPLOADED_FILE_PATH + file2Name);

		fileDetails.append(" Tag Details : " + multiPart.getField("firstName").getValue());
              
               String firstName=multiPart.getField("firstName").getValue();
               String lastName=multiPart.getField("lastName").getValue();
               
                System.out.println(firstName);
		System.out.println(lastName);
                System.out.println(fileDetails);

		return Response.ok(fileDetails.toString()).build();
	}

	private void saveFile(InputStream file, String name) {
		try {
			/* Change directory path */
			java.nio.file.Path path = FileSystems.getDefault().getPath(UPLOADED_FILE_PATH + name);
			/* Save InputStream as file */
			Files.copy(file, path);
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}

}
