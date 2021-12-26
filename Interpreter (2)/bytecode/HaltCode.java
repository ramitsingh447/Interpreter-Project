package interpreter.bytecode;

import interpreter.virtualmachine.VirtualMachine;

import java.util.ArrayList;

public class HaltCode extends ByteCode {
    String label;
    int offset;
    String id;
    int value;


    @Override
    public void init(ArrayList<String> args) {
    }


    @Override
    public String toString() {
        return null;
    }


    @Override
    public void execute(VirtualMachine virtualMachine) {
        virtualMachine.isRunning(false);

    }
}
