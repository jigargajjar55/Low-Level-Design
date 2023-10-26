package AbstractFactoryDesignPattern.CrossPlatformGUIExample.Controls.CheckBox;

public class MacCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created MAC checkbox.");
    }
}
