package interpreter.bytecode;

import interpreter.virtualmachine.VirtualMachine;

import java.util.ArrayList;

public class CallCode extends JumpCode {
    int address;
    String label;
    int offset;
    String id;
    int value;

    @Override
    public void init(ArrayList<String> args)

    {
        this.label = args.get(0);
        this.id = args.get(0).split("<<", 0)[0];


    }


    @Override
    public String toString()

    {
        return "CALL " + label + "\t" + id + "(";
    }

    @Override
    public void execute(VirtualMachine virtualMachine)

    {
        virtualMachine.savePC();
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
