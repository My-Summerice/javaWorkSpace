package Collection.OldExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        List<List<String>> list1 = new ArrayList<>();

        List<String> list3 = List.of("A", "B", "C"); // 使用这种静态方法可以创建一个不可修改的List,进行修改操作会抛异常

        String[] array = {"a", "b", "c", "d"};
        List<String> list4 = Arrays.asList(array);  // 使用数组的转List方法生成一个List

        // ############# 遍历集合的几种方式 ##########################################

        // 1.for循环遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));    // 使用索引获取元素
        }

        // 2.增强for循环遍历
        for (String element : list) {
            System.out.println(element);
            // arrayList 是线程不安全的，所以并发读写会抛并发修改异常
//            list1.add(list);    // 注意: List中存的是对象的引用而不是对象本身
//            list.clear();   // 所以这里如果把list元素清空，那么list1中对应的元素也会变为NULL
        }

        // 3.迭代器遍历
        Iterator<String> iterator = list3.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            // 使用 List.of() 创建出来的list是不被允许修改的
//            list3.add(iterator.next());
        }
        // 迭代器并不能实现并发读写arraylist的功能
//        Iterator<String> iterator2 = list4.iterator();
//        while (iterator2.hasNext()) {
//            System.out.println(iterator2.next());
//            list4.add("_add");
//        }

        // 4.java8 新特性，使用 Stream(流)遍历
        list3.stream().forEach(System.out::println);
    }
}
