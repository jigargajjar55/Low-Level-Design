package LLDBookMyShow.Model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import LLDBookMyShow.Enums.SeatCategory;

public class Show {

    int showID;
    Movie movie;
    int startTime;
    Set<Integer> bookedSeatID;

    public Show() {

        this.bookedSeatID = new HashSet<>();
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    

    public int getShowID() {
        return showID;
    }

    public void setShowID(int showID) {
        this.showID = showID;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    // Can implement Pricing based on release Date
    public double getPrice(SeatCategory seatCategory) {
        if (seatCategory == SeatCategory.GOLD) {
            return 300.0;
        } else if (seatCategory == SeatCategory.PREMIUM) {
            return 500.0;
        } else {
            return 180.0;
        }
    }

    public Set<Integer> getBookedSeatIds() {
        return bookedSeatID;
    }

   
}
