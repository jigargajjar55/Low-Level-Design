package CommandDesignPattern.UndoRedoExample;

public class PrevChannelCommand implements ICommand {

    Television tv;

    public PrevChannelCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {

        tv.prevChannel();

    }

    @Override
    public void undo() {
        tv.nextChannel();

    }

}
