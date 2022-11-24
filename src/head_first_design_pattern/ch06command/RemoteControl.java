package head_first_design_pattern.ch06command;

import java.util.Stack;

public class RemoteControl {
    private final int size = 7;
    Command[] onCommands;
    Command[] offCommands;
    Stack<Command> history;
    
    public RemoteControl() {
        onCommands = new Command[size];
        offCommands = new Command[size];
        history = new Stack<>();

        Command noCommand = new NoCommand();
        for (int i = 0; i < size; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        history.push(onCommands[slot]);
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        history.push(offCommands[slot]);
    }

    public void undoButtonWasPushed() {
        if (!history.isEmpty()) {
            history.pop().undo();
        }
    }
}
