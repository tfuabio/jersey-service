package com.sample.shinyay.rest.entities;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import javax.ws.rs.QueryParam;

public class MyBeanQuery {
  @QueryParam("id")
  @Min(1)
  private int id;

  @QueryParam("name")
  @Size(min = 3)
  private String name;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
