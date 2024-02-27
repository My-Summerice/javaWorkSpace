package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);

        // 格式化日期
        // 两个构造函数，可以指定时间输出格式或者不填参数走默认格式，默认格式也与Date.toString()格式不同
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("当前时间为：" + format.format(now));
    }
}
