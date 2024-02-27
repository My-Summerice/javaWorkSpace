package Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        // 在给指定索引位置添加元素时，索引数字不可大于现有容量，否报错
        list.add(4,"c"); // 可以添加重复元素
        System.out.println(list); // [a, b, c, d, c]

        list.remove("c"); // 通过元素值删，当有重复元素时会删索引最小的那个
        list.remove(1); // 删除指定索引位置的元素
        System.out.println(list); // [a, d, c]

        // 检查动态数组里是否包含某个值，同样的还有一个 containsAll 方法，参数也为一个动态数组
        System.out.println(list.contains("a")); // true
        System.out.println(list.contains("b")); // false
        System.out.println(list.contains("c")); // true

        System.out.println(list.size()); // 3

        // ############# 遍历集合的几种方式 ##########################################

        // 1.for循环遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));    // 使用索引获取元素
        }

        // 2.增强for循环遍历
        for (String element : list) {
            System.out.println(element);
            // arrayList 和 linkedList 是线程不安全的，所以并发读写会抛并发修改异常
            // 如果有并发读写的场景，应该使用 Vector
            // list1.add(list);    // 注意: List中存的是对象的引用而不是对象本身
            // list.clear();   // 所以这里如果把list元素清空，那么list1中对应的元素也会变为NULL
        }

        // 3.迭代器遍历
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            // 使用 List.of() 创建出来的list是不被允许修改的
            // list.add(iterator.next());
        }

        // 4.java8 新特性，使用 Stream(流)遍历
        list.stream().forEach(System.out::println);
    }
}
