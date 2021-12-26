package interpreter.bytecode.bopoperator;

public class BopNotEqualTo extends BopOperator {
    int result;
    int address;
    String label;
    int offset;
    String id;
    int value;
    @Override
    public int execute(int operandOne, int operandTwo)



    {



        return operandOne != operandTwo ? 1 : 0;



    }


}
