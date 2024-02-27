package Collection.List;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        list.add(5);
        list.add(2);
        list.add(8);
        list.add(0, 100); // 在指定下标位置添加元素
        list.set(0, 0); // 修改指定下标位置的元素值
        System.out.println(list); // 输出: [5, 2, 8]

        list.remove(2);
        System.out.println(list); // 输出: [5, 2]
        // 获取指定下标元素
        System.out.println(list.get(1)); // 输出: 2

        System.out.println(list.contains(5)); // 输出: true
        System.out.println(list.contains(8)); // 输出: false

        System.out.println(list.size()); // 输出: 2
    }
}
