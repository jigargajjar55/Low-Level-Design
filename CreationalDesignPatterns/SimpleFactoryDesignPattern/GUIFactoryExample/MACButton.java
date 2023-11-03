package SimpleFactoryDesignPattern.GUIFactoryExample;

public class MACButton implements Button {

    @Override
    public void render(){
        System.out.println("MAC button is rendered!");
    }
    
}
