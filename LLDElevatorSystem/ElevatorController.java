package LLDElevatorSystem;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ElevatorController {

    ElevatorCar elevatorCar;
    PriorityQueue<Integer> minHeapForUP;
    PriorityQueue<Integer> maxHeapForDown;
    Queue<Integer> pendingRequest;

    ElevatorController(ElevatorCar elevatorCar) {
        this.elevatorCar = elevatorCar;
        this.pendingRequest = new LinkedList<>();
        this.minHeapForUP = new PriorityQueue<>();
        this.maxHeapForDown = new PriorityQueue<>((p1, p2) -> Integer.compare(p2, p1));
    }

    public void submitExternalRequest(int floorNumber, Direction dir) {

        if (elevatorCar.currentFloor < floorNumber && dir == Direction.UP) {

            minHeapForUP.offer(floorNumber);

        } else if (elevatorCar.currentFloor > floorNumber && dir == Direction.DOWN) {
            maxHeapForDown.offer(floorNumber);
        } else {
            pendingRequest.offer(floorNumber);
        }
    }

    public void controlElevator() {

        while (true) {

            if (minHeapForUP.isEmpty() && maxHeapForDown.isEmpty() && pendingRequest.isEmpty()) {
                break;
            }

            if (elevatorCar.direction == Direction.UP) {

                while (!minHeapForUP.isEmpty()) {
                    int floor = minHeapForUP.peek();
                    minHeapForUP.poll();
                    elevatorCar.moveElevator(floor, Direction.UP);
                }

                while (!pendingRequest.isEmpty()) {
                    int floor = pendingRequest.peek();

                    pendingRequest.poll();

                    minHeapForUP.offer(floor);
                }

                elevatorCar.direction = Direction.DOWN;

            } else {

                while (!maxHeapForDown.isEmpty()) {
                    int floor = maxHeapForDown.peek();
                    maxHeapForDown.poll();
                    elevatorCar.moveElevator(floor, Direction.UP);
                }

                while (!pendingRequest.isEmpty()) {
                    int floor = pendingRequest.peek();

                    pendingRequest.poll();

                    maxHeapForDown.offer(floor);
                }

                elevatorCar.direction = Direction.UP;

            }

        }

    }

}
