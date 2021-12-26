package interpreter.bytecode.bopoperator;

public class BopLogicalOR extends BopOperator {
    int result;
    int address;
    String label;

    int offset;
    String id;
    int value;

    @Override
    public int execute(int operandOne, int operandTwo)



    {
        boolean orResult = (operandTwo == 0) | (operandOne == 0);
        if (orResult)




        {



            result = 1;




        }


        return result;


    }
}
