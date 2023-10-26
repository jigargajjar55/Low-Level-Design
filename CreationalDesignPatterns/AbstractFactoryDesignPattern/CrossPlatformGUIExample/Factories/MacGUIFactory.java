package AbstractFactoryDesignPattern.CrossPlatformGUIExample.Factories;

import AbstractFactoryDesignPattern.CrossPlatformGUIExample.Controls.Button.Button;
import AbstractFactoryDesignPattern.CrossPlatformGUIExample.Controls.Button.MacButton;
import AbstractFactoryDesignPattern.CrossPlatformGUIExample.Controls.CheckBox.Checkbox;
import AbstractFactoryDesignPattern.CrossPlatformGUIExample.Controls.CheckBox.MacCheckbox;

public class MacGUIFactory implements GUIFactory {

    @Override
    public Button createButton(){
        return new MacButton();
    }
    
    @Override
    public Checkbox createCheckbox(){
        return new MacCheckbox();
    }
}
