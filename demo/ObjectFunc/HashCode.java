package ObjectFunc;

public class HashCode {
    private int code;

    public HashCode(int code) {
        this.code = code;
    }

    @Override
    public int hashCode() {
        System.out.printf("this is parent's hashCode() : %d\n", super.hashCode());
        return code;
    }
}
