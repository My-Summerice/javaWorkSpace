package ObjectFunc;

public class Main {
    public static void main(String[] args) {
        // 重写equals()
        Equals x = new Equals(1,"1");
        Equals y = new Equals(2, "2");

        System.out.println(x.equals(x));    // 自反性
        System.out.println(x.equals(y));
        System.out.println(y.equals(x));
        System.out.println(x.equals(y) == y.equals(x)); // 对称性
        System.out.println(x.equals(y) && y.equals(x)); // 传递性

        // 重写hashCode()
        HashCode hc = new HashCode(114514);
        System.out.printf("this is override hashCode() : %d\n", hc.hashCode());

        // 重写toString()
        ToString ts = new ToString("哇，贞德食泥鸭");
        System.out.println(ts); // 直接调用对象就会默认返回toString()方法

        // 重写clone()
        try {
            Clone c = new Clone("cxk", 18);
            // 使用clone方法创建对象的拷贝
            Clone d = (Clone) c.clone();

            System.out.println(c);
            System.out.println(d);
            System.out.println(c == d);
            c.print();
            d.print();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
