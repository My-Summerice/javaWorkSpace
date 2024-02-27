package Array;

import java.util.Arrays;
import java.util.List;

import static DataStructure.Array.Main.randomString;

public class main {

    public static void main(String[] args) {

        // 声明和创建一个字符串数组
        String[] fruits = new String[8];
        for (int i = 0; i < 8; i++) {
            fruits[i] = "fruit" + i + "_" + randomString().substring(0, 3);
        }

        // 数组转字符串
        String fruitsStr = String.join(",", fruits);
        System.out.println(fruitsStr);

        // 字符串转数组
        String[] fruitsStrArr = fruitsStr.split(",");
        System.out.println(fruitsStrArr);

        // 数组转StringBuilder
        StringBuilder sb = new StringBuilder();
        for (String fruit : fruits) {
            sb.append(",").append(fruit);
        }
        System.out.println(sb);

        // StringBuilder转数组
        String[] fruitsStrArr2 = sb.toString().split(",");
        System.out.println(fruitsStrArr2);

        // 数组转list
        List<String> fruitsList = Arrays.asList(fruits);
        System.out.println(fruitsList);

        // list转数组
        String[] fruitsListStr = fruitsList.toArray(new String[fruitsList.size()]);
        System.out.println(fruitsListStr);

    }
}
