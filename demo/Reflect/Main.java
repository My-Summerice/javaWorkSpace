package Reflect;

public class Main {
    public static void main(String[] args) {
        System.out.println("=====================通过调用对象的 getClass() 方法创建一个该对象类型的新的对象============================");
        Reflect r = new Reflect();
        // 通过调用对象的getClass()方法创建一个新的对象
        Class<?> myClass = r.getClass();
        System.out.println("r.hashCode() is " + r.hashCode() + "\nmyClass.hashCode() is " + myClass.hashCode());
        System.out.println(myClass);
        System.out.println(myClass.hashCode());

        System.out.println("=====================通过类名.class创建一个新的对象==========================");
        // 通过类名.class创建一个新的对象
        Class<?> yourClass = Reflect.class;
        System.out.println(yourClass);
        System.out.println(yourClass.hashCode());

        System.out.println("=====================通过类名调用 Class.forName() 方法==========================");
        try {
            Class<?> forName = Class.forName("Reflect.Reflect");
            // 使用 myClass 进行后续操作
            System.out.println(forName);
            System.out.println(forName.hashCode());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}