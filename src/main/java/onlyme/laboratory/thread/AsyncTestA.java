package onlyme.laboratory.thread;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

@Slf4j
@Service
public class AsyncTestA {

    private final AsyncTestB asyncTestB;

    public AsyncTestA(AsyncTestB asyncTestB) {
        this.asyncTestB = asyncTestB;
    }

    @Async("async-A")
    public void asyncMethodA(int cnt) {
        log.info("method [A] cnt : {}, thread name : {}", cnt, Thread.currentThread().getName());
        IntStream.range(0,10).forEach(asyncTestB::asyncMethodB);
    }

}
