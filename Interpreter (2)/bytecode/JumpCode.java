package interpreter.bytecode;

public abstract class JumpCode extends ByteCode {
    String label;
    int offset;
    String id;
    int value;


    public abstract String getLabel();

    public abstract void setAddress(int newAddress);
}
