package LLDElevatorSystem;

public class ElevatorCar {

    int id;
    Display display;
    int currentFloor;
    Direction direction;
    ElevatorState state;
    InternalButtons button;
    ElevatorDoor door;

    public ElevatorCar() {
        display = new Display();
        currentFloor = 0;
        direction = Direction.UP;
        state = ElevatorState.IDLE;
        button = new InternalButtons();
        door = new ElevatorDoor();
    }

    

    public void showDisplay() {
        this.display.showDisplay();
    }

    public void setDisplay() {
        this.display.setDisplay(currentFloor, direction);
    }

    public boolean moveElevator(int destinationFloor, Direction direction) {

        int startFloor = this.currentFloor;

        if (direction == Direction.UP) {
            this.direction = direction;

            for (int floor = startFloor; floor <= destinationFloor; floor++) {

                this.currentFloor = floor;

                setDisplay();
                showDisplay();

                if (floor == destinationFloor) {
                    return true;
                }

            }

        }

        else if (direction == Direction.DOWN) {
            this.direction = direction;

            for (int floor = startFloor; floor >= 0; floor--) {
                this.currentFloor = floor;
                setDisplay();
                showDisplay();

                if (floor == destinationFloor) {
                    return true;
                }
            }
        }

        return false;

    }

}
