package Collection.List;

import java.util.List;
import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {

        List<String> list = new Vector<>();

        list.add("apple");
        list.add("banana");
        list.add("orange");

        System.out.println(list); // 输出: [apple, banana, orange]

        list.remove("banana");

        System.out.println(list); // 输出: [apple, orange]

        System.out.println(list.get(1)); // 输出: orange

        System.out.println(list.contains("apple")); // 输出: true
        System.out.println(list.contains("banana")); // 输出: false

        System.out.println(list.size()); // 输出: 2

        // 虽然 Vector 是线程安全的，但在迭代器中修改List的长度会使迭代器异常
        for (String item : list) {
            list.add("a");
            list.remove(list.size() - 1);
            System.out.println(item);
        }
    }
}
