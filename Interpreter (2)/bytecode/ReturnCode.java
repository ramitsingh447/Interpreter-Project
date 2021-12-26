package interpreter.bytecode;

import interpreter.virtualmachine.VirtualMachine;

import java.util.ArrayList;

public class ReturnCode extends ByteCode {

    int offset;
    String id;
    String baseid;
















    @Override
    public void init(ArrayList<String> args)

    {
        if (!args.isEmpty())

        {
            this.id = args.get(0);
            this.baseid = args.get(0).split("<<", 0)[0];

        }

    }





    @Override
    public String toString()

    {
        String base = "RETURN ";
        if (id != null) {
            base += id + "\tEXIT " + baseid + ": ";
        }
        return base;
    }




    @Override

    public void execute(VirtualMachine virtualMachine)

    {
        virtualMachine.popFrame();
        virtualMachine.returnPC();
    }
}
