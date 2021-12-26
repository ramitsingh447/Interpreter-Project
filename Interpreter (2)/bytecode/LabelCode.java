package interpreter.bytecode;

import interpreter.virtualmachine.VirtualMachine;

import java.util.ArrayList;

public class LabelCode extends JumpCode {
    String label;
    int offset;
    String id;
    int value;


    @Override
    public void init(ArrayList<String> args)


    {
        this.label = args.get(0);
    }

    @Override
    public String toString()

    {
        return "LABEL " + this.label;
    }

    @Override
    public void execute(VirtualMachine virtualMachine)

    {

    }

    @Override
    public String getLabel()


    {
        return this.label;
    }

    @Override
    public void setAddress(int newAddress)

    {

    }
}
