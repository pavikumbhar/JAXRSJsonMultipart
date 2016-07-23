/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pavikumbhar.javaheart.application;

import com.pavikumbhar.javaheart.filter.CORSFilter;
import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author pavikumbhar
 */
/*
@ApplicationPath("/rest")
public class ApplicationConf extends ResourceConfig {  
public ApplicationConf() {
        //register the necessary headers files needed from client
        register(CORSFilter.class);
      
        //The jackson feature and provider is used for object serialization
        //between client and server objects in to a json
        register(org.glassfish.jersey.jackson.JacksonFeature.class);
        register(com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider.class);
      
      //Glassfish multipart file uploader feature
        register(org.glassfish.jersey.media.multipart.MultiPartFeature.class);
        //inject and registered all resources class using the package

        //not to be tempered with
        packages("com.pavikumbhar.javaheart.resource");
       // register(RESTRequestFilter.class);
    }

}*/