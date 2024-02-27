package IntegerCache;

public class Main {
    public static void main(String[] args) {
//        Integer a = new Integer(123);     // java9 之后不允许用户使用
        Integer b = Integer.valueOf(123);
        Integer c = 123;

        System.out.println(b.equals(c));
    }
}
