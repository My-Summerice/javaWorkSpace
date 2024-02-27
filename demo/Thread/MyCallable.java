package Thread;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {

    @Override
    public Integer call() throws InterruptedException {

        // 模拟耗时场景
        Thread.sleep(2000);
        System.out.println(this.getClass().getName() + " " + Thread.currentThread().getName());
        return 666;
    }

}
