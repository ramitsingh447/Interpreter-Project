package interpreter.bytecode.bopoperator;

public class BopGreaterThanEqualTo extends BopOperator {
    int result;
    int address;
    String label;
    int offset;
    String id;
    int value;

    @Override
    public int execute(int operandOne, int operandTwo)

    {
        if (operandOne >= operandTwo)


        {


            result = 1;



        }



        return result;


    }
}
