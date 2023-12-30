package LLDBookMyShow.Model;

import LLDBookMyShow.Enums.SeatCategory;

public class Seat {

    int seatID;
    int row;
    SeatCategory seatCategory;

    public Seat(int seatID, int row, SeatCategory seatCategory) {
        this.seatID = seatID;
        this.row = row;
        this.seatCategory = seatCategory;
    }

    public int getSeatID() {
        return seatID;
    }

    public void setSeatID(int seatID) {
        this.seatID = seatID;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public SeatCategory getSeatCategory() {
        return seatCategory;
    }

    public void setSeatCategory(SeatCategory seatCategory) {
        this.seatCategory = seatCategory;
    }

}
