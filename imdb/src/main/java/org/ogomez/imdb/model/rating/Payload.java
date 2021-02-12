package org.ogomez.imdb.model.rating;

public class Payload {

  private String tconst;
  private float averageRating;
  private int numVotes;

  public Payload(String tconst, float averageRating, int numVotes) {
    this.tconst = tconst;
    this.averageRating = averageRating;
    this.numVotes = numVotes;
  }

  public Payload() {
  }

  public String getTconst() {
    return tconst;
  }

  public void setTconst(String tconst) {
    this.tconst = tconst;
  }

  public float getAverageRating() {
    return averageRating;
  }

  public void setAverageRating(float averageRating) {
    this.averageRating = averageRating;
  }

  public int getNumVotes() {
    return numVotes;
  }

  public void setNumVotes(int numVotes) {
    this.numVotes = numVotes;
  }

}
