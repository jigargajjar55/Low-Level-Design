package CommandDesignPattern.ACRemoteExample;

public class AirConditioner {

    boolean isOn;
    int temperature;

    public void turnOnAc(){
        isOn = true;
        System.out.println("AC is On!");
    }

    public void turnOffAC(){
        isOn = false;
        System.out.println("AC is Off!");
    }

    public void setTemperature(int temp){
        temperature = temp;
        System.out.println("Temperature changed to: "+ temperature);
    }
    
}
