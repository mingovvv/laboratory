package onlyme.laboratory.java.thread.basic;

public class Main {

    public static void main(String[] args) {
        System.out.println("main start");

        System.out.println("main class : " + Thread.currentThread().getName());

        // 1. Runnable 인터페이스 구현 방식
        Runnable runnable = new ThreadA();
        Thread thread = new Thread(runnable);
        thread.start();

        // 함수적 인터페이스, 람다식 사용
        Thread thread1 = new Thread(() -> {
            System.out.println("ThreadA class - implements Runnable : " + Thread.currentThread().getName());
        });
        thread1.start();

        // 2. Thread 상속 방식
        ThreadB thread2 = new ThreadB();
        thread2.start();

        // 익명 객체를 통한 작업스레드 생성
        Thread thread3 = new Thread() {
            @Override
            public void run() {
                System.out.println("ThreadB class - extends Thread : " + Thread.currentThread().getName());
            }
        };
        thread3.start();

        System.out.println("main end");
    }

}

