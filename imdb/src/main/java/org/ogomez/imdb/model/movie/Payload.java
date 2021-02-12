package org.ogomez.imdb.model.movie;

public class Payload {

  private String tconst;
  private String titleType;
  private String primaryTitle;
  private String originalTitle;
  private String isAdult;
  private String startYear;
  private String endYear;
  private String runtimeMinutes;
  private String genres;

  public Payload(String tconst, String titleType, String primaryTitle, String originalTitle,
      String isAdult, String startYear, String endYear, String runtimeMinutes,
      String genres) {
    this.tconst = tconst;
    this.titleType = titleType;
    this.primaryTitle = primaryTitle;
    this.originalTitle = originalTitle;
    this.isAdult = isAdult;
    this.startYear = startYear;
    this.endYear = endYear;
    this.runtimeMinutes = runtimeMinutes;
    this.genres = genres;
  }

  public Payload() {
  }

  public String getTconst() {
    return tconst;
  }

  public void setTconst(String tconst) {
    this.tconst = tconst;
  }

  public String getTitleType() {
    return titleType;
  }

  public void setTitleType(String titleType) {
    this.titleType = titleType;
  }

  public String getPrimaryTitle() {
    return primaryTitle;
  }

  public void setPrimaryTitle(String primaryTitle) {
    this.primaryTitle = primaryTitle;
  }

  public String getOriginalTitle() {
    return originalTitle;
  }

  public void setOriginalTitle(String originalTitle) {
    this.originalTitle = originalTitle;
  }

  public String getIsAdult() {
    return isAdult;
  }

  public void setIsAdult(String isAdult) {
    this.isAdult = isAdult;
  }

  public String getStartYear() {
    return startYear;
  }

  public void setStartYear(String startYear) {
    this.startYear = startYear;
  }

  public String getEndYear() {
    return endYear;
  }

  public void setEndYear(String endYear) {
    this.endYear = endYear;
  }

  public String getRuntimeMinutes() {
    return runtimeMinutes;
  }

  public void setRuntimeMinutes(String runtimeMinutes) {
    this.runtimeMinutes = runtimeMinutes;
  }

  public String getGenres() {
    return genres;
  }

  public void setGenres(String genres) {
    this.genres = genres;
  }

}
