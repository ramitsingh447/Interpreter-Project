package interpreter.bytecode;

import interpreter.virtualmachine.VirtualMachine;

import java.util.ArrayList;

public class DumpCode extends ByteCode {
    String dumpState;
    int address;
    String label;
    int offset;
    String id;
    int value;

    @Override
    public void init(ArrayList<String> args)


    {
        this.dumpState = args.get(0);
    }


    @Override
    public String toString()


    {
        return " ";
    }

    @Override
    public void execute(VirtualMachine virtualMachine)


    {
        if (dumpState.equals("ON"))


        {
            virtualMachine.setDump(true);

        }

        else if (dumpState.equals("OFF"))


        {
            virtualMachine.setDump(false);
        }
    }

}
