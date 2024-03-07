package For;

public class Main {

    public static void main(String[] args) {

        int j = 0;

        for (int i = 0; i < 10; i++) {
//            j = j++;  // 输出0，先赋值再自增
            j = ++j;  // 输出10，先自增再赋值
//            ++j; j++;   // 输出10
        }

        System.out.println(j);
    }
}
