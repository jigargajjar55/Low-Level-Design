package LLDBookMyShow.Model;

import java.util.Date;

public class Movie {
    int movieID;
    String movieName;
    int movieDuration;
    // Date releaseDate;
    // other details like Genere, Language etc.

    public Movie(int movieID, String movieName, int movieDuration) {
        this.movieID = movieID;
        this.movieName = movieName;
        this.movieDuration = movieDuration;
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getMovieDuration() {
        return movieDuration;
    }

    public void setMovieDuration(int movieDuration) {
        this.movieDuration = movieDuration;
    }

}