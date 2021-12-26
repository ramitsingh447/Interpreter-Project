package interpreter.bytecode;

import interpreter.virtualmachine.VirtualMachine;

import java.util.ArrayList;


public class ArgsCode extends ByteCode {
    int value;
    int address;
    String label;
    int offset;
    String id;


    @Override
    public void init(ArrayList<String> args)



    {





        this.value = Integer.parseInt(args.get(0));






    }

    @Override
    public String toString()


    {





        return "ARGS " + value;







    }

    @Override
    public void execute(VirtualMachine virtualMachine)







    {





        virtualMachine.pushNewFrame(value);



    }
}
