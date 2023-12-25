package LLDElevatorSystem;

public class Floor {
    int floorNumber;
    ExternalButton button;

    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
        this.button = new ExternalButton();
    }

    
}
