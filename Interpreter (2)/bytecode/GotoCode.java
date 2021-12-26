package interpreter.bytecode;

import interpreter.virtualmachine.VirtualMachine;

import java.util.ArrayList;

public class GotoCode extends JumpCode

{
    int address;
    String label;
    int offset;
    String id;
    int value;

    @Override
    public void init(ArrayList<String> args)


    {
        label = args.get(0);
    }

    @Override
    public String toString()


    {
        return "GOTO " + label;
    }

    @Override
    public void execute(VirtualMachine virtualMachine)


    {
        virtualMachine.setPC(address);
    }

    @Override
    public String getLabel()


    {
        return label;
    }

    @Override
    public void setAddress(int newAddress)

    {
        this.address = newAddress;
    }
}
