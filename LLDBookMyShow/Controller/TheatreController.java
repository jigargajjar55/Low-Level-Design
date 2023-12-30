package LLDBookMyShow.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import LLDBookMyShow.Model.Movie;
import LLDBookMyShow.Model.Screen;
import LLDBookMyShow.Model.Show;
import LLDBookMyShow.Model.Theatre;

public class TheatreController {

    Map<String, List<Theatre>> cityWiseTheatre;
    List<Theatre> allTheatre;

    public TheatreController() {
        this.cityWiseTheatre = new HashMap<>();
        this.allTheatre = new ArrayList<>();
    }

    public void addTheatre(Theatre theatre, String city) {

        allTheatre.add(theatre);

        if (!cityWiseTheatre.containsKey(city)) {
            cityWiseTheatre.put(city, new ArrayList<>());
        }

        cityWiseTheatre.get(city).add(theatre);

    }

    public Map<Theatre, List<Show>> getAllShowsForMovie(Movie movie, String city) {

        Map<Theatre, List<Show>> theatreWiseShow = new HashMap<>();
        List<Theatre> getAllTheatre = cityWiseTheatre.get(city);

        for (Theatre theatre : getAllTheatre) {

            List<Show> giveMovieShows = new ArrayList<>();
            List<Screen> screens = theatre.getScreens();

            for (Screen screen : screens) {

                for (Show show : screen.getShows()) {

                    if (show.getMovie().getMovieID() == movie.getMovieID()) {
                        giveMovieShows.add(show);
                    }
                }

            }

            if (!giveMovieShows.isEmpty()) {
                theatreWiseShow.put(theatre, giveMovieShows);
            }
        }

        return theatreWiseShow;

    }

}
