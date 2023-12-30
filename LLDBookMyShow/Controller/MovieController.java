package LLDBookMyShow.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import LLDBookMyShow.Model.Movie;

public class MovieController {

    Map<String, List<Movie>> cityWiseMovies;
    List<Movie> allMovies;

    public MovieController() {
        cityWiseMovies = new HashMap<>();
        allMovies = new ArrayList<>();
    }

    public void addMovie(Movie movie, String city) {

        allMovies.add(movie);

        if (!cityWiseMovies.containsKey(city)) {
            cityWiseMovies.put(city, new ArrayList<>());
        }

        cityWiseMovies.get(city).add(movie);

    }

    public Movie getMovieByName(String movieName) {

        for (Movie movie : allMovies) {

            if (movie.getMovieName().equals(movieName)) {
                return movie;
            }
        }

        return null;
    }

    public List<Movie> getMoviesByCity(String city) {

        if (cityWiseMovies.containsKey(city)) {
            return cityWiseMovies.get(city);
        }

        return new ArrayList<>();
    }

    // REMOVE movie from a particular city, make use of cityVsMovies map

    // UPDATE movie of a particular city, make use of cityVsMovies map

    // CRUD operation based on Movie ID, make use of allMovies list

}
