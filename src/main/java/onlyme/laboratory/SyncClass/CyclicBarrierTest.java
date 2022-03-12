package onlyme.laboratory.SyncClass;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierTest {
    public static void main(String[] args) throws InterruptedException, BrokenBarrierException {

        CyclicBarrier cyclicBarrier = new CyclicBarrier(5, () -> System.out.println("장벽해제"));

        ExecutorService es = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 4; i++) {
            int n = i;
            es.submit(() -> {
                cyclicBarrier.await(); // async thread 4번 await
                System.out.println("order :: " + n); // CountDownLatch class와 다르게 async thread도 실행되지 않음.
                return 1;
            });
        }

        Thread.sleep(5000); // main thread sleep 5sec
        cyclicBarrier.await(); // main thread 까지 await 5번의 조건을 충족하였기에 lock되어 있던 main thread와 async thread 둘다 진행됨.
        es.shutdown();
        System.out.println("finish");


    }
}
