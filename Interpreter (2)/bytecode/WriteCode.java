package interpreter.bytecode;

import interpreter.virtualmachine.VirtualMachine;

import java.util.ArrayList;

public class WriteCode extends ByteCode
{



    @Override

    public void init(ArrayList<String> args)
    {


    }




    @Override

    public String toString()
    {
        return "WRITE";
    }








    @Override

    public void execute(VirtualMachine virtualMachine)

    {
        int temp = virtualMachine.peekRTS();
        System.out.println(temp);

    }
}
