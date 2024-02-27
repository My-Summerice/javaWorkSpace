package Thread;

public class MyThread extends Thread {


    @Override
    public void run() {

        System.out.println(this.getClass().getName() + " " + Thread.currentThread().getName());
    }
}