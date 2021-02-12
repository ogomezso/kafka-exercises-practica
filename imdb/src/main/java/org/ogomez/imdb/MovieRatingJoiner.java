package org.ogomez.imdb;

import org.apache.kafka.streams.kstream.ValueJoiner;
import org.ogomez.imdb.model.movie.Movie;
import org.ogomez.imdb.model.ratedmovie.RatedMovie;
import org.ogomez.imdb.model.rating.Rating;

public class MovieRatingJoiner implements ValueJoiner<Rating, Movie, RatedMovie> {

  @Override
  public RatedMovie apply(Rating rating, Movie movie) {
    return new RatedMovie(movie.getPayload().getTconst(), movie.getPayload().getOriginalTitle(), rating.getPayload().getAverageRating(),
        rating.getPayload().getNumVotes());
  }
}
