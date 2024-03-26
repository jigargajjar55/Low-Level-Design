package CommandDesignPattern.ACRemoteExample;

public class Client {
    
    public static void main(String[] args) {
        
        AirConditioner airConditioner = new AirConditioner();
        RemoteController remote = new RemoteController();

        remote.setCommand(new TurnACOnCommand(airConditioner));
        remote.pressButton();
    }
}
