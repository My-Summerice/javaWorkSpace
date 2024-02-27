package Thread;


import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class Executor {


    public static void main(String[] args) {
        // 一个任务构建一个线程
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new MyRunnable());
        }

        // 使用Lambda创建一个匿名的内部线程
        executorService.execute(() -> {

            try {
                Thread.sleep(1000);
                System.out.println("Thread run");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

//        executorService.shutdown();
        executorService.shutdownNow();
        System.out.println("Main end");
    }

}
