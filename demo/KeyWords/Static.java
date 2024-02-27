package KeyWords;

public class Static {
    private static String CXK = "jntm";
    private String KUN_KUN = "香翅捞饭";

    // 静态语句块
    static {
        System.out.println("123");
    }

    //
    static void outerKun() {
        System.out.println("外部鲲鲲");
    }

    static class InnerStaticClass {
        public void print() {
            System.out.println(CXK);
            // 静态内部类只能访问外部类的静态变量和方法
//            System.out.println(KUN_KUN);  // Non-static field 'KUN_KUN' cannot be referenced from a static context
        }

        public void innerKun() {
            System.out.println("内部鲲鲲");
        }

        public void outerKun() {
            Static.outerKun();
        }
    }
}
