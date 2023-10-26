package AbstractFactoryDesignPattern.CrossPlatformGUIExample;

import AbstractFactoryDesignPattern.CrossPlatformGUIExample.Controls.Button.Button;
import AbstractFactoryDesignPattern.CrossPlatformGUIExample.Controls.CheckBox.Checkbox;
import AbstractFactoryDesignPattern.CrossPlatformGUIExample.Factories.GUIFactory;
import AbstractFactoryDesignPattern.CrossPlatformGUIExample.Factories.MacGUIFactory;
import AbstractFactoryDesignPattern.CrossPlatformGUIExample.Factories.WindowGUIFactory;

public class Application {

    GUIFactory guiFactory;
    Button button;
    Checkbox checkbox;

    public Application(String os){

        this.guiFactory = getGUIForOS(os);
        this.button = guiFactory.createButton();
        this.checkbox = guiFactory.createCheckbox();

    }

    private GUIFactory getGUIForOS(String os){

        switch(os){

            case "Windows 10":{
                return new WindowGUIFactory();
            }
            case "MAC OS":{
                return new MacGUIFactory();
            }
            default: {
                return null;
            }
        }
    }

    
    
    public void paint(){

        this.button.paint();
        this.checkbox.paint();
        
        
    }
    
}
