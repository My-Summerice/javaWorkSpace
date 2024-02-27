package Generics;

public class AddNumber {
    // 泛型-数字类数据相加（结果为double）
    public static <T extends Number> void addNumber(T a, T b) {
        System.out.println(a.doubleValue() + "+" + b.doubleValue() + "=" + (a.doubleValue() + b.doubleValue()));
    }

    // 多个字符串拼接
    public static StringBuilder addString(String[] strings) {
        StringBuilder sb = new StringBuilder();
        for (String str : strings) {
            sb.append(str);
        }
        System.out.println(sb);
        return sb;
    }

    // 传参均为数字时返回double类型相加结果,入参包含字符串时均返回拼接字符串
    // 见隔壁 GenericMethodExample
}
