package com.headFirst.commander.control;

import java.util.EmptyStackException;
import java.util.Stack;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Stack<Command> undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        undoCommand = new Stack<Command>();

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
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
        undoCommand.push(onCommands[slot]);
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand.push(offCommands[slot]);
    }

    public void undoButtonWasPushed() {
        try {
            System.out.println("undoing");
            Command lastCommand = undoCommand.pop();
            lastCommand.undo();
        } catch (EmptyStackException e) {
            System.out.println("Nothing to undo");
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n============ Remote Control ===============\n");
        for (int i=0; i < onCommands.length; i++) {
            stringBuffer.append("[slot " + i +"] " + onCommands[i].getClass().getName() + "    " + offCommands[i].getClass().getName() + "\n");
        }

        return stringBuffer.toString();
    }

    private class NoCommand implements Command {
        @Override
        public void execute() {
            System.out.println("Slot not assigned");
        }

        @Override
        public void undo() {
            System.out.println("Slot not assigned");
        }
    }
}
