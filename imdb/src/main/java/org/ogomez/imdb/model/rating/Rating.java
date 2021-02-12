package org.ogomez.imdb.model.rating;

import org.ogomez.imdb.model.schema.Schema;

public class Rating {

  private Schema schema;
  private Payload payload;

  public Rating(Schema schema, Payload payload) {
    this.schema = schema;
    this.payload = payload;
  }

  public Rating() {
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
