package AbstractFactoryDesignPattern.CrossPlatformGUIExample.Factories;

import AbstractFactoryDesignPattern.CrossPlatformGUIExample.Controls.Button.Button;
import AbstractFactoryDesignPattern.CrossPlatformGUIExample.Controls.CheckBox.Checkbox;

public interface GUIFactory {

    public Button createButton();
    public Checkbox createCheckbox();
    
}
