package AbstractFactoryDesignPattern.CrossPlatformGUIExample.Controls.CheckBox;

public class WindowCheckbox implements Checkbox {

    @Override
    public void paint(){
        System.out.println("You have created Window checkbox.");
    }
    
}
