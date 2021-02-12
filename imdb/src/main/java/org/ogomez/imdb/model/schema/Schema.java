package org.ogomez.imdb.model.schema;

import java.util.List;

public class Schema {

  private String type;
  private List<Field> fields = null;
  private Boolean optional;
  private String name;

  public Schema(String type, List<Field> fields, Boolean optional, String name) {
    this.type = type;
    this.fields = fields;
    this.optional = optional;
    this.name = name;
  }

  public Schema() {
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public List<Field> getFields() {
    return fields;
  }

  public void setFields(List<Field> fields) {
    this.fields = fields;
  }

  public Boolean getOptional() {
    return optional;
  }

  public void setOptional(Boolean optional) {
    this.optional = optional;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


}
