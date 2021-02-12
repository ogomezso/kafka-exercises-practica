package org.ogomez.imdb.serializers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Serializer;
import org.ogomez.imdb.model.ratedmovie.RatedMovie;

import java.util.Map;

public class RatedMovieSerializer implements Serializer<RatedMovie> {

  @Override
  public void configure(Map<String, ?> configs, boolean isKey) {

  }

  @Override
  public byte[] serialize(String s, RatedMovie pojo) {

    byte[] retVal = null;
    ObjectMapper objectMapper = new ObjectMapper();
    try {
      retVal = objectMapper.writeValueAsString(pojo).getBytes();
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }
    return retVal;
  }

  @Override
  public void close() {

  }
}
