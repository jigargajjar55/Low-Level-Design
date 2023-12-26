package LLDCarRentalSystem.Model;

import LLDCarRentalSystem.Model.Reservation.Reservation;

public class Bill {
    Reservation reservation;
    boolean isPaid;
    double totalAmount;

    public Bill(Reservation reservation) {
        this.reservation = reservation;
        this.isPaid = false;
        totalAmount = computeBillAmount();

    }

    private double computeBillAmount() {

        //Business logic
        return 100.0;
    }
}
