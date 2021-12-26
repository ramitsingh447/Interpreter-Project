package interpreter.bytecode;

import interpreter.virtualmachine.VirtualMachine;

import java.util.ArrayList;

public class LitCode extends ByteCode {
    int offset;
    String id;
    int value;

    @Override
    public void init(ArrayList<String> args)


    {
        this.value = Integer.parseInt(args.get(0));
        if (args.size() > 1)


        {
            this.id = args.get(1);
        }

    }


    @Override
    public String toString()

    {
        String base = "LIT " + value;
        if (id != null)

        {
            base += ("\tint " + id);
        }

        return base;
    }

    @Override
    public void execute(VirtualMachine virtualMachine)


    {
        virtualMachine.pushRTS(value);
    }


}
