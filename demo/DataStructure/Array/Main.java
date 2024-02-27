package DataStructure.Array;

import java.util.UUID;

public class Main {
    // 使用uuid生成随机字符串
    public static String randomString() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    public static void main(String[] args) {
        // 声明和创建一个字符串数组
        String[] fruits = new String[8];

        // 数组长度
        int length = fruits.length;  // 获取数组长度

        // 初始化数组并赋值
        fruits[0] = "Apple";
        fruits[1] = "Banana";
        fruits[2] = "Orange";

        for (int i = 3; i < length; i++) {
            fruits[i] = "fruit" + i + "_" + randomString().substring(0, 3);
        }

        // 访问数组元素
        System.out.println(fruits[0]);  // 输出：Apple

        // 遍历数组
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
