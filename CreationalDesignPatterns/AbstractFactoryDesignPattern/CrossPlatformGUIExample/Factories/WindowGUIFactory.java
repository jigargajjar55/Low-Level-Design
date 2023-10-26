package AbstractFactoryDesignPattern.CrossPlatformGUIExample.Factories;

import AbstractFactoryDesignPattern.CrossPlatformGUIExample.Controls.Button.Button;
import AbstractFactoryDesignPattern.CrossPlatformGUIExample.Controls.Button.WindowButton;
import AbstractFactoryDesignPattern.CrossPlatformGUIExample.Controls.CheckBox.Checkbox;
import AbstractFactoryDesignPattern.CrossPlatformGUIExample.Controls.CheckBox.WindowCheckbox;

public class WindowGUIFactory implements GUIFactory {

    @Override
    public Button createButton(){
        return new WindowButton();
    }

    @Override
    public Checkbox createCheckbox(){
        return new WindowCheckbox();
    }
    
}
