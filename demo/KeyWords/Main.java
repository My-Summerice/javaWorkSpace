package KeyWords;

public class Main {
    public static void main(String[] args) {
        // final 关键字
        Final ikun = new Final();
        ikun.print();   // print() 已经调过一次 printIkun() 了

        final Final ikun_plus = new Final();    // final使引用不变，及不能再使用该变量引用其它对象，但不影响被引用对象本身的修改操作
        ikun_plus.IKUN = "香精煎鱼";    // 可以修改对象的属性
        ikun_plus.print();

//        ikun_plus = ikun;     // 编译报错：Cannot assign a value to final variable 'ikun_plus'  // 可见，不可修改引用对象

        // static 关键字
        // 多次实例化同一个类，这个类的静态语句块只会执行一次
        Static xhz = new Static();
        Static xhz2 = new Static();

        // 静态内部类
        Static.InnerStaticClass innerStaticClass = new Static.InnerStaticClass();
        innerStaticClass.print();
        innerStaticClass.innerKun();
        innerStaticClass.outerKun();
    }
}
