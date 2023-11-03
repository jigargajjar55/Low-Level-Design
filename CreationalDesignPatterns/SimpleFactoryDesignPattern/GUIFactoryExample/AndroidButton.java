package SimpleFactoryDesignPattern.GUIFactoryExample;

public class AndroidButton implements Button {

    @Override
    public void render(){
        System.out.println("Android button is rendered!");
    }
    
}
