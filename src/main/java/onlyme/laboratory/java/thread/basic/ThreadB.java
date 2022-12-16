package onlyme.laboratory.java.thread.basic;

public class ThreadB extends Thread {

    @Override
    public void run() {
        System.out.println("ThreadB class - extends Thread : " + Thread.currentThread().getName());
    }
}
