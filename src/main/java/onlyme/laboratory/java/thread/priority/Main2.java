package onlyme.laboratory.java.thread.priority;

/**
 * Thread 우선순위 적용 테스트
 */
public class Main2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            Thread thread = new Calc("thread" + i);
            if (i != 10) {
                thread.setPriority(Thread.MIN_PRIORITY);
            } else {
                thread.setPriority(Thread.MAX_PRIORITY);
            }
            thread.start();
        }

    }
}

