package interpreter.bytecode;

import interpreter.virtualmachine.VirtualMachine;

import java.util.ArrayList;

public class StoreCode extends ByteCode {



    int offset;
    String id;
    int value;






    @Override
    public void init(ArrayList<String> args)

    {
        this.offset = Integer.parseInt(args.get(0));
        if (args.size() > 1)

        {
            this.id = args.get(1);
        }

    }






    @Override
    public String toString()

    {
        return "STORE " + offset + " " + id + "\t" + id + " = ";
    }





    @Override
    public void execute(VirtualMachine virtualMachine)

    {
        virtualMachine.storeRTS(offset);
    }
}
