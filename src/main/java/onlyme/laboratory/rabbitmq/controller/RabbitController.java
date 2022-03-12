package onlyme.laboratory.rabbitmq.controller;

import lombok.RequiredArgsConstructor;
import onlyme.laboratory.rabbitmq.service.RabbitService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RabbitController {

    private final RabbitService rabbitService;

//    @GetMapping("/rabbit")
//    public String test() {
//        rabbitService.publishMessage();
//        return "rabbit-push";
//    }

}
