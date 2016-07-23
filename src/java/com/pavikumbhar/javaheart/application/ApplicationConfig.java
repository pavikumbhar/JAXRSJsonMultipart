package com.pavikumbhar.javaheart.application;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import com.pavikumbhar.javaheart.resource.FileService;
import com.pavikumbhar.javaheart.resource.MessageResource;
import com.pavikumbhar.javaheart.resource.PersonResource;
import com.pavikumbhar.javaheart.resource.UploadFileServiceGF;
import com.pavikumbhar.javaheart.resource.FileUploadResource;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
 * @author pavikumbhar
 */
@ApplicationPath("/rest") // set the path to REST web services
public class ApplicationConfig extends Application {
    
    @Override
    public Set<Class<?>> getClasses() {
        final Set<Class<?>> classes = new HashSet<Class<?>>();
       classes.add(org.glassfish.jersey.media.multipart.MultiPartFeature.class);
       classes.add(org.glassfish.jersey.jackson.JacksonFeature.class);
       classes.add(com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider.class);
   
       
       classes.add(FileService.class);
       classes.add(MessageResource.class);
       classes.add(PersonResource.class);
       classes.add(UploadFileServiceGF.class);
       classes.add(FileUploadResource.class);
       
        return classes;
    }
    
   
}
