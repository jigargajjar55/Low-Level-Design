package MementoDesignPattern;

public class Client {

    public static void main(String[] args) {

        ConfigurationCareTaker careTakerObject = new ConfigurationCareTaker();

        // Initiate State of the originator
        ConfigurationOriginator originatorObject = new ConfigurationOriginator(10, 10);

        originatorObject.display();

        // Save it
        ConfigurationMemento snapShot1 = originatorObject.createMemento();

        // Add into History
        careTakerObject.addMemento(snapShot1);

        // Change in Height
        originatorObject.setHeight(20);

        originatorObject.display();

        // Save it again
        ConfigurationMemento snapShot2 = originatorObject.createMemento();

        // Add into History
        careTakerObject.addMemento(snapShot2);

        originatorObject.setHeight(30);
        originatorObject.setWidth(30);

        originatorObject.display();

        // Undo
        ConfigurationMemento prevSnapShot = careTakerObject.undo();

        originatorObject.restoreMemento(prevSnapShot);

        originatorObject.display();

        // Undo again
        ConfigurationMemento prevSnapShot2 = careTakerObject.undo();

        originatorObject.restoreMemento(prevSnapShot2);

        originatorObject.display();

        // Undo again
        ConfigurationMemento prevSnapShot3 = careTakerObject.undo();

        originatorObject.restoreMemento(prevSnapShot3);

        originatorObject.display();

    }
}
