package interpreter.bytecode;
import java.util.ArrayList;
import interpreter.virtualmachine.VirtualMachine;


public class PopCode extends ByteCode {
    int N;
    int offset;


    @Override
    public void init(ArrayList<String> args) {
        N = Integer.parseInt(args.get(0));
    }






    @Override
    public String toString()



    {

        return "POP " + N;

    }

    @Override
    public void execute(VirtualMachine virtualMachine)


    {
        for (int count = 0; count < N; count++)

        {

            int temp = virtualMachine.popRTS();

        }
    }
}
