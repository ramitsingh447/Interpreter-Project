package interpreter.bytecode.bopoperator;

public class BopLogicalAnd extends BopOperator {
    int result;
    int address;
    String label;
    int offset;
    String id;
    int value;

    @Override
    public int execute(int operandOne, int operandTwo)




    {
        boolean andResult = (operandTwo == 1) & (operandOne == 1);
        if (andResult)


        {



            result = 1;



        }



        return result;



    }
}
