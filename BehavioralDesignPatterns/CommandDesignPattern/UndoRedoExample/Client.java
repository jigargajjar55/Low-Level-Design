package CommandDesignPattern.UndoRedoExample;

public class Client {

    public static void main(String[] args) {

        Television television = new Television(5);

        RemoteController remote = new RemoteController();

        remote.setCommand(new NextChannelCommand(television));

        remote.pressButton();

        remote.pressButton();
        remote.pressButton();
        remote.pressButton();
        remote.pressButton();
        remote.pressButton();
        remote.undo();
    }
}
