package org.kranthi.application.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/*************************************************************************
 **
 ** Kranthi Kiran Kalletla
 **
 ** NOTICE:  All information contained herein is, and remains the property of
 ** Kranthi Kiran Kalletla. Dissemination of this information or reproduction 
 ** of this material is strictly forbidden unless prior written permission is 
 ** obtained from Kranthi Kiran Kalletla.
 **
 **
 ** © 2017 Kranthi Kiran Kalletla
 ** All Rights Reserved. 
 **
 ** Created by Kranthi Kiran Kalletla on 4/24/2017.
 ** File Name: InjectDemo
 **
 ** Purpose: 
 **
 *************************************************************************/

@Path("/injectdemo")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class InjectDemo {

    @GET
    @Path("annotations")
    public String getParamsUsingAnnotations(){
        return "Test";
    }

}
