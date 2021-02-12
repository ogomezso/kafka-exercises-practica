package org.ogomez.imdb.model.movie;


import org.ogomez.imdb.model.schema.Schema;

public class Movie {

  private Schema schema;
  private Payload payload;

  public Movie(Schema schema, Payload payload) {
    this.schema = schema;
    this.payload = payload;
  }

  public Movie() {
  }

  public Schema getSchema() {
    return schema;
  }

  public void setSchema(Schema schema) {
    this.schema = schema;
  }

  public Payload getPayload() {
    return payload;
  }

  public void setPayload(Payload payload) {
    this.payload = payload;
  }

}
