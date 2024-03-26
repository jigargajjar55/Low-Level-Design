package CommandDesignPattern.UndoRedoExample;

import java.util.*;

public class RemoteController {

    Stack<ICommand> commandHistoryStack;
    ICommand command;

    public RemoteController() {
        commandHistoryStack = new Stack<>();
    }

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
        commandHistoryStack.push(command);
    }

    public void undo() {

        if (!commandHistoryStack.isEmpty()) {
            ICommand command = commandHistoryStack.pop();
            command.undo();
        }
    }
}
