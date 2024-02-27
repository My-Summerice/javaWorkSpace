package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// 同步一个代码块
public class SynchronizedExample {

    private String objName;

    // 有参构造函数
    public SynchronizedExample(String objName) {
        this.objName = objName;
    }

    public void func1() {
        // 使用synchronized关键字，达到并发安全地执行这段代码块
        synchronized (this) { // this代表对当前对象进行同步，代表同一时刻只能有一个线程进入该代码块
            for (int i = 0; i < 10; i++) {
                System.out.print(objName + ":" + i + "\n");
            }
        }
    }

    public static void main(String[] args) {
        SynchronizedExample e1 = new SynchronizedExample("thread1");
        SynchronizedExample e2 = new SynchronizedExample("thread2");
        // 创建线程池
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> e1.func1());
//        executorService.execute(() -> e1.func1());
        executorService.execute(() -> e2.func1());
    }

}
