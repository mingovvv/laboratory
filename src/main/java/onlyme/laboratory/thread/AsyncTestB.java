package onlyme.laboratory.thread;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Slf4j
@Service
public class AsyncTestB {

    @Async("async-B")
    public void asyncMethodB(int cnt) {
        try {
            TimeUnit.MILLISECONDS.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("method [B] cnt : {}, thread name : {}", cnt, Thread.currentThread().getName());
    }
}
