package org.ogomez.imdb;

import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.streams.StreamsConfig;

import java.util.*;

public class MovieTopology {

  public static final String MOVIES_TOPIC = "imdb-movies-titles-basic-topic";
  public static final String REKEYED_MOVIES_TOPIC = "rekeyed-movies-topic";
  public static final String RATINGS_TOPIC = "imdb-title-ratings-topic";
  public static final String RATED_MOVIES_TOPIC = "imdb-rated-movies-topic";
  public static final String REKEYED_RATING_TOPIC = "rekeyed-rating-topic";

  public static final String BOOTSTRAP_SERVERS = "127.0.0.1:9092, 127.0.0.1:9093, 127.0.0.1:9094";
  private static final String TEMP_STATE_DIR = "./temp";
  private static final int NUM_PARTITIONS = 3;
  private static final short REPLICATION_FACTOR = 3;
  private static final String PROCESSING_GUARANTEE_CONFIG= "exactly_once";

  public static Properties createStreamsConfigProperties(String applicationId) {

    Properties streamsConfiguration = new Properties();
    streamsConfiguration.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, BOOTSTRAP_SERVERS);
    streamsConfiguration.put(StreamsConfig.APPLICATION_ID_CONFIG, applicationId);
    streamsConfiguration.put(
        StreamsConfig.STATE_DIR_CONFIG, TEMP_STATE_DIR);
    streamsConfiguration.put(
        StreamsConfig.PROCESSING_GUARANTEE_CONFIG,PROCESSING_GUARANTEE_CONFIG);

    return streamsConfiguration;
  }

  public static void createTopics() {
    Map<String, Object> config = new HashMap<>();

    config.put("bootstrap.servers", BOOTSTRAP_SERVERS);
    AdminClient client = AdminClient.create(config);

    List<NewTopic> topics = new ArrayList<>();

    topics.add(new NewTopic(
        MOVIES_TOPIC,
        NUM_PARTITIONS,
        REPLICATION_FACTOR));

    topics.add(new NewTopic(
        REKEYED_MOVIES_TOPIC,
        NUM_PARTITIONS,
        REPLICATION_FACTOR));

    topics.add(new NewTopic(
        RATINGS_TOPIC,
        NUM_PARTITIONS,
        REPLICATION_FACTOR));

    topics.add(new NewTopic(
        RATED_MOVIES_TOPIC,
        NUM_PARTITIONS,
        REPLICATION_FACTOR));

    topics.add(new NewTopic(
            REKEYED_RATING_TOPIC,
            NUM_PARTITIONS,
            REPLICATION_FACTOR));

    client.createTopics(topics);
    client.close();

  }

}
