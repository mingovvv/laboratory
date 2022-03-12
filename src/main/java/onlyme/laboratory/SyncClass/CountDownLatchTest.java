package onlyme.laboratory.SyncClass;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchTest {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(5);

        ExecutorService es = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            int n = i;
            es.execute(() -> {
                countDownLatch.countDown();
                System.out.println("order :: " + n);
            });
        }

        countDownLatch.await(); // 코드가 중단되어야 하는 지점 설정, countDown() 메소드가 인자값 만큼 호출되어야 lock 풀림
        es.shutdown();
        System.out.println("finish");
    }
}
