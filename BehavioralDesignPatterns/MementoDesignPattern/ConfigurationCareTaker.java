package MementoDesignPattern;

import java.util.Stack;

public class ConfigurationCareTaker {
    
    Stack<ConfigurationMemento> historyStack = new Stack<>();

    public void addMemento(ConfigurationMemento memento){
        historyStack.push(memento);
    }

    public ConfigurationMemento undo(){

        if(!historyStack.isEmpty()){
            
            ConfigurationMemento lastMemento = historyStack.pop();

            return lastMemento;
        }

        return null;
    }
}
