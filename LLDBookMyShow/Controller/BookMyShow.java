package LLDBookMyShow.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import LLDBookMyShow.Enums.SeatCategory;
import LLDBookMyShow.Model.Booking;
import LLDBookMyShow.Model.Location;
import LLDBookMyShow.Model.Movie;
import LLDBookMyShow.Model.Screen;
import LLDBookMyShow.Model.Seat;
import LLDBookMyShow.Model.Show;
import LLDBookMyShow.Model.Theatre;

public class BookMyShow {

    MovieController movieController;
    TheatreController theatreController;

    public BookMyShow() {
        movieController = new MovieController();
        theatreController = new TheatreController();

        initialize();
    }

    public void createBooking(String userCity, String movieName) {

        // 1. search movie by my location
        List<Movie> movies = movieController.getMoviesByCity(userCity);

        // 2. select the movie which you want to see. i want to see Baahubali
        Movie interestedMovie = null;
        for (Movie movie : movies) {

            if ((movie.getMovieName()).equals(movieName)) {
                interestedMovie = movie;
            }
        }

        // 3. get all show of this movie in Bangalore location
        Map<Theatre, List<Show>> showsTheatreWise = theatreController.getAllShowsForMovie(interestedMovie, userCity);

        // 4. select the particular show user is interested in
        Map.Entry<Theatre, List<Show>> entry = showsTheatreWise.entrySet().iterator().next();
        List<Show> runningShows = entry.getValue();
        Show interestedShow = runningShows.get(0);

        // 5. select the seat
        int seatNumber = 30;
        Set<Integer> bookedSeats = interestedShow.getBookedSeatIds();
        if (!bookedSeats.contains(seatNumber)) {
            bookedSeats.add(seatNumber);
            // startPayment
            Booking booking = new Booking();
             List<Seat> myBookedSeats = new ArrayList<>();
            // for (Seat screenSeat : interestedShow.getScreen().getSeats()) {
            //     if (screenSeat.getSeatID() == seatNumber) {
            //         myBookedSeats.add(screenSeat);
            //     }
            // }
            booking.setSeats(myBookedSeats);
            booking.setShow(interestedShow);
        } else {
            // throw exception
            System.out.println("seat already booked, try again");
            return;
        }

        System.out.println("BOOKING SUCCESSFUL");
    }

    private void initialize() {

        Location location1 = new Location("B 91, Paras Mall", "Bangalore", "Karnataka");
        Location location2 = new Location("D-Mart mall", "Surat", "Gujarat");
        Location location3 = new Location("D-Mart mall", "Delhi", "Delhi");

        // create movies
        createMovies(location1, location2, location3);

        // create theater with screens, seats and shows
        createTheatre(location1, location2, location3);
    }

    // creating 2 theatre
    private void createTheatre(Location location1, Location location2, Location location3) {

        Theatre inoxTheatre = new Theatre();
        inoxTheatre.setTheatreID(1);
        inoxTheatre.setScreens(createScreen());
        inoxTheatre.setLocation(location1);

        Theatre pvrTheatre = new Theatre();
        pvrTheatre.setTheatreID(2);
        pvrTheatre.setScreens(createScreen());
        pvrTheatre.setLocation(location3);

        theatreController.addTheatre(inoxTheatre, location1.getCity());
        theatreController.addTheatre(pvrTheatre, location3.getCity());

    }

    private List<Screen> createScreen() {

        Movie avengerMovie = movieController.getMovieByName("AVENGERS");
        Movie baahubali = movieController.getMovieByName("BAAHUBALI");

        List<Screen> screens = new ArrayList<>();
        Screen screen1 = new Screen();
        screen1.setScreenID(1);
        screen1.setSeats(createSeats());
        // screen1.setMovie(new Movie(1,"AVENGERS", 180));

        List<Show> shows = new ArrayList<>();
        Show morningShow = createShows(1, avengerMovie, 8);
        Show eveningShow = createShows(2, baahubali, 16);
        shows.add(morningShow);
        shows.add(eveningShow);

        screen1.setShows(shows);

        screens.add(screen1);
        return screens;
    }

    private Show createShows(int showId, Movie movie, int showStartTime) {

        Show show = new Show();
        show.setShowID(showId);
        show.setMovie(movie);

        show.setStartTime(showStartTime); // 24 hrs time ex: 14 means 2pm and 8 means 8AM
        return show;
    }

    // creating 100 seats
    private List<Seat> createSeats() {

        // creating 100 seats for testing purpose, this can be generalised
        List<Seat> seats = new ArrayList<>();

        for (int i = 0; i < 100; i++) {

            int seatID = i;
            int row = 0;
            SeatCategory seatCategory = null;

            if (i >= 0 && i < 40) {
                row = 1;
                seatCategory = SeatCategory.SILVER;
            } else if (i >= 40 && i < 70) {
                row = 2;
                seatCategory = SeatCategory.GOLD;

            } else {
                row = 3;
                seatCategory = SeatCategory.PREMIUM;
            }

            Seat seat = new Seat(seatID, row, seatCategory);

            seats.add(seat);
        }

        return seats;
    }

    private void createMovies(Location location1, Location location2, Location location3) {

        // create Movies1
        Movie avengers = new Movie(1, "AVENGERS", 180);

        // create Movies2
        Movie baahubali = new Movie(2, "BAAHUBALI", 180);

        // add movies against the cities
        movieController.addMovie(avengers, location1.getCity());
        movieController.addMovie(avengers, location3.getCity());
        movieController.addMovie(baahubali, location1.getCity());
        movieController.addMovie(baahubali, location3.getCity());
    }
}
