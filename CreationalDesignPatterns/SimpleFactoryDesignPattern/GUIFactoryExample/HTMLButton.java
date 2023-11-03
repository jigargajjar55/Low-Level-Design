package SimpleFactoryDesignPattern.GUIFactoryExample;

public class HTMLButton implements Button {

    @Override
    public void render(){
        System.out.println("HTML button is rendered!");
    }

    
    
}
