package onlyme.laboratory.thread;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
public class AsyncConfig {

    @Bean("async-A")
    public Executor asyncThreadTaskA() {
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setCorePoolSize(1);
        threadPoolTaskExecutor.setMaxPoolSize(1);
        threadPoolTaskExecutor.setThreadNamePrefix("async-A");
        return threadPoolTaskExecutor;
    }

    @Bean("async-B")
    public Executor asyncThreadTaskB() {
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setCorePoolSize(100);
        threadPoolTaskExecutor.setMaxPoolSize(100);
        threadPoolTaskExecutor.setThreadNamePrefix("async-B");
        return threadPoolTaskExecutor;
    }

}
