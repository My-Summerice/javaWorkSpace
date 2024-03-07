package Thread;

import java.util.concurrent.FutureTask;

public class ThreadTest {


    static void doRunnable() {

        // 实现了该接口的类只能被当作线程中执行的一个任务，真正的线程是Thread
        MyRunnable myRunnable = new MyRunnable();
        // 本质上还是使用Thread在起线程，但是可以传入Runnable对象
        Thread thread = new Thread(myRunnable);
        thread.start();
    }

    static void doCallable() {

        // 实现了该接口的类只能被当作线程中执行的一个任务，真正的线程是Thread
        MyCallable myCallable = new MyCallable();
        // FutureTask的主要特点包括：
        // 1.异步执行：FutureTask可以在后台线程中执行耗时的任务，不会阻塞主线程的执行。通过将任务逻辑封装在FutureTask的匿名内部类或自定义类中，可以使用ExecutorService提交FutureTask对象来执行任务。
        // 2.获取结果：FutureTask提供了方法来获取任务的执行结果。可以通过调用get()方法来获取结果，该方法会阻塞主线程，直到任务执行完成并返回结果。也可以使用带有超时参数的get()方法，限定等待的时间。
        // 3.取消任务：FutureTask可以被取消，通过调用cancel()方法可以请求取消任务的执行。一旦任务被取消，再次调用get()方法将会抛出CancellationException异常。
        FutureTask<Object> futureTask = new FutureTask<>(myCallable);
        Thread thread = new Thread(futureTask);
        thread.start();
    }

    /**
     * 创建线程池的几种方式
     * 阿里开发规范建议不要Executors创建线程池
     * 线程池基本参数*****
     * 线程池执行原理*****
     *
     * synchronized关键字
     * 锁对象
     * 修饰静态跟非静态的区别
     * AQS
     *
     * 设计模式
     *     单例，工厂，策略
     *
     */





    static void doThread() {

        MyThread myThread = new MyThread();
        myThread.start();
    }


    public static void main(String[] args) {

        // 实现Runnable接口的线程
        doRunnable(); // 线程0

        // 实现Callable接口的线程
        doCallable(); // 线程1

        // 继承Thread类的线程
        doThread(); // 线程2

        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }
    }
}
