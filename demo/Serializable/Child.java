package Serializable;

import java.io.IOException;
import java.io.Serializable;

/**
 * 结论：
 * 如果要对一个类（该类实现了序列化接口，而父类没有实现）进行反序列化（从字节序列转为对象），那么该类的父类必须要有
 * 无参构造函数（光有有参构造函数不行），否则反序列化时会无法生成父类对象导致报错，
 */

public class Child extends Parent implements Serializable {

    private static final long   serialVersionUID = 1L;
    private              String name;
    private              int    age;

    //    public Child() {
    //
    //        super();
    //        System.out.println("调用父类的无参构造函数");
    //    }

    public Child(String field, String name) {

        super(field);
        this.name = name;
        System.out.println("调用父类的有参构造函数");
    }

//    @Override
//    public String toString() {
//
//        return "测试修改类对反序列化的影响";
////        return "Child{" + "name='" + name + '\'' + '}';
//    }

    private static final String filePath = "./Serializable/child.ser";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // 序列化
//        serializeParent();
        // 反序列化
        deserializeParent();
    }

    private static void serializeParent() throws IOException {

        System.out.println("==================== 开始序列化 =====================");
        Child child = new Child("parent", "child");
        java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(new java.io.FileOutputStream(filePath));
        // 序列化指定对象
        oos.writeObject(child);
        oos.close();
    }

    private static void deserializeParent() throws IOException, ClassNotFoundException {

        System.out.println("==================== 开始反序列化 ====================");
        java.io.ObjectInputStream ois = new java.io.ObjectInputStream(new java.io.FileInputStream(filePath));
        // 反序列化
        Child child = (Child) ois.readObject();
        ois.close();
        System.out.println(child);
    }
}
