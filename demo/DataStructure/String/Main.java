package DataStructure.String;

public class Main {
    public static void main(String[] args) {
        // String
        String s1 = "s1";
        s1 = s1 + " aaaaaaaaaa";    // 会创建一个新的对象，且由于变量名被覆盖导致无法再使用原有字符串"s1"

        // StringBuilder
        StringBuilder s2 = new StringBuilder("s2");
        s2.append(s1); // 字符串末尾追加内容（追加的内容不限数据类型，需要注意的是，如果追加的是一个对象，则默认追加的是该对象的toString()的结果）
        s2.insert(2, s1); // 相当于比append()多了一个指定下标（第一个参数）的功能
        s2.delete(6, 7); // 删除指定下标区间（左闭右开）内的字符串内容，比如这里就是删掉下标为6的内容
        s2.replace(6, 7, " replace "); // 与delete类似，delete相当于相当于替换的内容为空
        s2.reverse(); // 反转字符串，完全倒序 abc -> cba
        int s2Len = s2.length(); // 返回字符串长度
        System.out.println(s2Len);
        char s2Char = s2.charAt(1); // 返回指定下标位置的字符，只有一个参数，不可以选择区间
        System.out.println(s2Char);

        // StringBuffer
        StringBuffer s3 = new StringBuffer("s3");
        // StringBuffer的方法与StringBuilder的完全一致，只不过前者线程安全性能较低，后者性能较高线程不安全

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
