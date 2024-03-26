package CommandDesignPattern.UndoRedoExample;

public class NextChannelCommand implements ICommand {

    Television tv;

    public NextChannelCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.nextChannel();
    }

    @Override
    public void undo() {

        tv.prevChannel();
    }

}
