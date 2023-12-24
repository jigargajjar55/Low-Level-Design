package LLDParkingLot.Services;



import java.util.List;

import LLDParkingLot.Models.*;
import LLDParkingLot.Models.Vehicle.Vehicle;

public interface ParkingStrategy {
    public ParkingSlot findParkingSpace(Vehicle vehicle, List<ParkingFloor> floors);
}
