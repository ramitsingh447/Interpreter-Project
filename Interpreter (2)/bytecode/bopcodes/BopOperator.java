package interpreter.bytecode.bopoperator;

import java.util.HashMap;

public abstract class BopOperator {

    private static HashMap<String, BopOperator> bopOps;
    int address;
    String label;
    int offset;
    String id;
    int value;
    static {



        bopOps = new HashMap<>();
        bopOps.put(("+"), new BopAdd());
        bopOps.put(("-"), new BopSubtract());
        bopOps.put(("/"), new BopDivide());
        bopOps.put(("*"), new BopMultiply());
        bopOps.put(("=="), new BopEqualTo());
        bopOps.put((">="), new BopGreaterThan());
        bopOps.put(("|"), new BopLogicalOR());
        bopOps.put(("&"), new BopLogicalAnd());
        bopOps.put(("!="), new BopNotEqualTo());
        bopOps.put(("<="), new BopLessThanEqualTo());
        bopOps.put(("<"), new BopLessThan());
        bopOps.put((">"), new BopGreaterThanEqualTo());


    }


    public abstract int execute(int operandOne, int operandTwo);

    public static BopOperator getOperator(String token)



    {



        return bopOps.get(token);



    }



}
