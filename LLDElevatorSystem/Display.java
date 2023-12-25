package LLDElevatorSystem;

public class Display {

    int floorNumber;
    Direction direction;

    public void setDisplay(int floorNumber, Direction direction) {
        this.floorNumber = floorNumber;
        this.direction = direction;
    }

    public void showDisplay() {
        System.out.println("Floor: " + floorNumber);
        System.out.println("Direction: " + direction);
    }

}
