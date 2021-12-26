package interpreter.bytecode;

import interpreter.virtualmachine.VirtualMachine;

import java.util.ArrayList;

public class LoadCode extends ByteCode {
    int offset;
    String id;
    int value;


    @Override
    public void init(ArrayList<String> args)

    {
        if (args.size() != 1)

        {
            offset = Integer.parseInt(args.get(0));
            id = args.get(args.size() -1);
        }
        else


            {

            offset = Integer.parseInt((String)args.get(0));
            }
    }

    @Override
    public String toString()

    {
        String base = "LOAD " + offset;
        if (id != null)

        {

            base+= " " + id + "\t<load " + id + ">";

        }


        return base;


    }

    @Override




    public void execute(VirtualMachine virtualMachine)


    {
        virtualMachine.loadRTS(offset);
    }
}
