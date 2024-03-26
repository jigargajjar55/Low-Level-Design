package CommandDesignPattern.UndoRedoExample;

public interface ICommand {

    public void execute();

    public void undo();
}
