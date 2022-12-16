package onlyme.laboratory.java.thread.basic;

// interface Runnable을 구현하는 방법
public class ThreadA implements Runnable {

    @Override
    public void run() {
        System.out.println("ThreadA class - implements Runnable : " + Thread.currentThread().getName());
    }

}
