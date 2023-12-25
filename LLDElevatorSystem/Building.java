package LLDElevatorSystem;

import java.util.ArrayList;
import java.util.List;

public class Building {

    int buildingNumber;
    List<Floor> floors;

    Building(int buildingNumber, int numOfFloors) {

        this.buildingNumber = buildingNumber;
        this.floors = new ArrayList<>();

        for (int i = 0; i < numOfFloors; i++) {
            floors.add(new Floor(i + 1));
        }

    }

}
