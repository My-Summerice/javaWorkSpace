package Collection.OldExample;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);
        System.out.println(map.get("Orange"));
        System.out.println(map.get(2)); // 不可以反向映射，这样做取到的是null
    }
}
