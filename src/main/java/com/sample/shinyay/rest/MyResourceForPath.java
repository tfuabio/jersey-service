package com.sample.shinyay.rest;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("path/{query}")
public class MyResourceForPath {
  @GET
  public String getPath(@PathParam("query") @NotNull @Size(min = 3) String query) {
    return query + "\n";
  }
}
