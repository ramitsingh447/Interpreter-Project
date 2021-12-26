package interpreter.bytecode;

import interpreter.virtualmachine.VirtualMachine;
import java.util.ArrayList;
import java.util.Scanner;




public class ReadCode extends ByteCode

{
    Scanner userInput = new Scanner(System.in);

    @Override
    public void init(ArrayList<String> args)

    {

    }

    @Override
    public String toString()

    {
        return "READ";
    }

    @Override
    public void execute(VirtualMachine virtualMachine)


    {
        System.out.print("Please enter an integer: \n");
        int input = userInput.nextInt();
        virtualMachine.pushRTS(input);
    }
}
