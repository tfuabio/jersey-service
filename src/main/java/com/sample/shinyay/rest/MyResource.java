package com.sample.shinyay.rest;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.sample.shinyay.rest.entities.MyRequestBodyEntity;

@Path("myresource")
public class MyResource {

    // @GET
    // public Response getExample(@QueryParam("number") @ValidEnumValue(enumClass = MyEnum.class) Integer number) {
    //     // バリデーションが成功した場合は、Enumに定義された数値が含まれていることが保証されます
    //     MyEnum myEnum = MyEnum.values()[number - 1];
    //     return Response.ok("Valid Enum value: " + myEnum.name()).build();
    // }
    @GET
    @Path("enumString")
    public Response enumString(@QueryParam("number") @ValidEnumValue(enumClass = MyStringEnum.class) String string) {
        return Response.ok("Valid Enum value: " + string + "\n").build();
    }

    @GET
    @Path("enumInteger")
    public Response enumInteger(@QueryParam("number") @ValidEnumValue(enumClass = MyIntegerEnum.class) Integer number) {
        MyIntegerEnum myEnum = MyIntegerEnum.values()[number - 1];
        return Response.ok("Valid Enum value: " + myEnum.name() + "\n").build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response postBody(@Valid MyRequestBodyEntity body) {
        return Response.ok(body.getName()).build();
    }
}
