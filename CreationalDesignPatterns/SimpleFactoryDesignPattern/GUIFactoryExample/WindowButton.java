package SimpleFactoryDesignPattern.GUIFactoryExample;

public class WindowButton implements Button {

    @Override
    public void render(){
        System.out.println("Window button is rendered!");
    }

   
    
}
