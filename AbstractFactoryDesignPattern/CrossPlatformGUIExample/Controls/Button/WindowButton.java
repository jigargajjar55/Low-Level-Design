package AbstractFactoryDesignPattern.CrossPlatformGUIExample.Controls.Button;

public class WindowButton implements Button {

    @Override
    public void paint(){
        System.out.println("You have created Window Button.");
    }
    
}
