package interpreter.bytecode;

import interpreter.virtualmachine.VirtualMachine;

import java.util.ArrayList;



public abstract class ByteCode
{
    int address;
    String label;
    int offset;
    String id;
    int value;


    public abstract void init(ArrayList<String> args);

    public abstract void execute(VirtualMachine virtualMachine);
}
