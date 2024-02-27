package Thread;

public class MyRunnable implements Runnable {

    // 重写run方法，实现Runnable接口
    @Override
    public void run() {

        MyThread myThread = new MyThread();
        try {
            myThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(this.getClass().getName() + " " + Thread.currentThread().getName());
    }
}
