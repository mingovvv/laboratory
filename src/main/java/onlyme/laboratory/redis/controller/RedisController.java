package onlyme.laboratory.redis.controller;

import lombok.RequiredArgsConstructor;
import onlyme.laboratory.redis.dto.Exam;
import onlyme.laboratory.redis.dto.Student;
import onlyme.laboratory.redis.service.RedisService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/redis")
public class RedisController {

    private final RedisService redisService;

    @GetMapping("/cacheable/student")
    public Student getStudent(@RequestParam Long id) {
        return redisService.getStudent(id);
    }

    @GetMapping("/cacheable/exam")
    public Exam getExam(@RequestParam Long id) {
        return redisService.getExam(id);
    }

}
