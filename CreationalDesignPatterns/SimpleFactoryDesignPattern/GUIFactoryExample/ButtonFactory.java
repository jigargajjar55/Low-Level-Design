package SimpleFactoryDesignPattern.GUIFactoryExample;

public class ButtonFactory {

    public Button getButton(String propertyString) {

        switch (propertyString) {

            case "Windows OS": {
                return new WindowButton();
            }
            case "Web Browser": {
                return new HTMLButton();
            }
            case "Android OS" : {
                return new AndroidButton();
            }
            case "Mac OS":{
                return new MACButton();
            }
            default: {
                return null;
            }

        }
    }

}
