package MementoDesignPattern;

public class ConfigurationOriginator {
    int height;
    int width;

    public ConfigurationOriginator(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void display() {

        System.out.println("Height is: " + height);
        System.out.println("Width is: " + width);

        System.out.println("====================================");
    }

    public ConfigurationMemento createMemento() {
        return new ConfigurationMemento(height, width);
    }

    public void restoreMemento(ConfigurationMemento mementoToBeRestored) {

        if (mementoToBeRestored != null) {
            this.height = mementoToBeRestored.getHeight();
            this.width = mementoToBeRestored.getWidth();
        }else {
            System.out.println("No more History!");
        }
    }
}
