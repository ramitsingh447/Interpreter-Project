package interpreter.bytecode.bopoperator;

public class BopAdd extends BopOperator {

    int address;
    String label;
    int offset;
    String id;
    int value;
    @Override
    public int execute(int operandOne, int operandTwo)

    {


        return operandOne + operandTwo;


    }
}
