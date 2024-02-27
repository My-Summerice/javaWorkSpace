package DataType;

public class DataType {
    public static void main(String[] args) {
        short s = 11111;
        float f = 1.1f;

        s += f;
        f += s;

        System.out.println(s);
        System.out.println(f);
    }
}
