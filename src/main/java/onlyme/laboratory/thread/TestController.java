package onlyme.laboratory.thread;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.IntStream;

@RestController
public class TestController {

    public final AsyncTestA asyncTestA;

    public TestController(AsyncTestA asyncTestA) {
        this.asyncTestA = asyncTestA;
    }

    @GetMapping("/async")
    public String test() {
        IntStream.range(0,10).forEach(asyncTestA::asyncMethodA);
        return "ok";
    }

}
