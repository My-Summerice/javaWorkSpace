package KeyWords;

public class Final extends ParentClass {
    String IKUN = "食不食油饼";

    final void print() {
        // IKUN = "哎呦，你干嘛";     // Cannot assign a value to final variable 'IKUN'
        System.out.println(IKUN);
        printIkun();
    }

    // final 声明的方法不可被重写，但可以被使用
//    void printIkun();     // 'printIkun()' cannot override 'printIkun()' in 'KeyWords.ParentClass'; overridden method is final
}
