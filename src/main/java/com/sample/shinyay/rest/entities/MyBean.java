package com.sample.shinyay.rest.entities;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * リクエストエンティティJSONにアノテーションで制約を付与
 */
public class MyBean {
  @NotNull
  @Min(1)
  private int id;

  @NotNull
  @Size(min = 3)
  private String name;

  @NotNull
  @Min(5)
  private int age;

  public Integer getId() {
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

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

}
