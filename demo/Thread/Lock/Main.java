package Thread.Lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    private static Integer i = 0;

    // synchronized
    public synchronized void testMethod() {
        // 操作同步资源
        i = i + 10;
        System.out.println(i);
    }

    // ReentrantLock
    private final ReentrantLock lock = new ReentrantLock(); // 需要保证多个线程使用的是同一个锁

    public void modifyPublicResources() {

        lock.lock();
        // 操作同步资源
        i++;
        System.out.println(i);
        lock.unlock();
    }


    public static void main(String[] args) {

        Main main = new Main();
        ExecutorService executorService = Executors.newCachedThreadPool();
        // ---------- 悲观锁 ----------
        // 1. synchronized
        executorService.execute(() -> main.testMethod());
        executorService.execute(() -> main.testMethod());
        // 2. ReentrantLock
        executorService.execute(() -> main.modifyPublicResources());
        executorService.execute(() -> main.modifyPublicResources());
        System.out.println(i);
        executorService.shutdown();

        // ------------------------- 乐观锁的调用方式 -------------------------
        AtomicInteger atomicInteger = new AtomicInteger();  // 需要保证多个线程使用的是同一个AtomicInteger
        atomicInteger.incrementAndGet(); //执行自增1
    }
}
