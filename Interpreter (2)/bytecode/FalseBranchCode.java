package interpreter.bytecode;

import interpreter.virtualmachine.VirtualMachine;

import java.util.ArrayList;

public class FalseBranchCode extends JumpCode {
    int address;
    String label;
    int offset;
    String id;
    int value;


    @Override
    public void init(ArrayList<String> args) {
        this.label = args.get(0);
    }

    @Override
    public String toString() {
        return "FALSEBRANCH " + label;
    }


    @Override
    public void execute(VirtualMachine virtualMachine)


    {
        int value = virtualMachine.popRTS();
        if (value == 0)


        {
            virtualMachine.setPC(address);

        }
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
