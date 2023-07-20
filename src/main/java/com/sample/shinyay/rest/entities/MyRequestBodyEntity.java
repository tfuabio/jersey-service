package com.sample.shinyay.rest.entities;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import com.sample.shinyay.rest.MyIntegerEnum;
import com.sample.shinyay.rest.ValidEnumValue;

/**
 * リクエストエンティティJSONにアノテーションで制約を付与
 */
public class MyRequestBodyEntity {
  @Min(1)
  private int id;

  @Size(min = 3)
  private String name;

  @Min(5)
  private int age;

  @ValidEnumValue(enumClass = MyIntegerEnum.class)
  private String bodyString;

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

  public String getBodyString() {
    return bodyString;
  }

  public void setBodyString(String bodyString) {
    this.bodyString = bodyString;
  }


}
