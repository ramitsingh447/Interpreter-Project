package interpreter.bytecode;

import interpreter.bytecode.bopoperator.BopOperator;
import interpreter.virtualmachine.VirtualMachine;

import java.util.ArrayList;

public class BopCode extends ByteCode {
    String bopOperatorString;
    int address;
    String label;
    int offset;
    BopOperator bopOperator;
    String id;
    int value;

    @Override
    public void init(ArrayList<String> args)

    {

        bopOperator = BopOperator.getOperator(args.get(0));
        bopOperatorString = args.get(0);



    }

    @Override
    public String toString()






    {

        return "BOP " + bopOperatorString;

    }

    @Override
    public void execute(VirtualMachine virtualMachine)

    {
        int operandTwo = virtualMachine.popRTS();
        int operandOne = virtualMachine.popRTS();
        virtualMachine.pushRTS(bopOperator.execute(operandOne,operandTwo));



    }
}
