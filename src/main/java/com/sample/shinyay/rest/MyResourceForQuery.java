package com.sample.shinyay.rest;

import javax.validation.Valid;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.sample.shinyay.rest.entities.MyBeanQuery;

@Path("query")
public class MyResourceForQuery {
  @GET
  public String getQuery(@Valid @BeanParam MyBeanQuery beanQuery) {
    return "id: " + beanQuery.getId() + ", name: " + beanQuery.getName() + "\n";
  }
}
