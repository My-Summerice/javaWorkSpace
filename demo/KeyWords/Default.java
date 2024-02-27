package KeyWords;

public class Default extends A implements I {

    public static void main(String[] args) {
        Default b = new Default();
        System.out.println(b.F());
    }
}

class A implements I {
    @Override
    public String F() {
        return "重写了";
    }
}

interface I {
    default String F() {
        return "返回默认方法";
    }
}