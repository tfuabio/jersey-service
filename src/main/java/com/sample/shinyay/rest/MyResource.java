package com.sample.shinyay.rest;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.sample.shinyay.rest.entities.MyBean;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("json")
public class MyResource {

    @GET
    public String getIt() {
        return "Got it!";
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response echoPost(@Valid MyBean bean) {
        return Response.ok("ID: " + bean.getId() + "\nName: " + bean.getName() + "\nAge: " + bean.getAge() + "\n")
                .build();
    }
}
