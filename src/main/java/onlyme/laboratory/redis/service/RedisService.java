package onlyme.laboratory.redis.service;

import lombok.RequiredArgsConstructor;
import onlyme.laboratory.redis.dto.Exam;
import onlyme.laboratory.redis.dto.Student;
import onlyme.laboratory.redis.repository.RedisRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RedisService {

    private final RedisRepository redisRepository;

    public Student getStudent(Long id) {
        return (Student) redisRepository.getStudent(id);
    }

    public Exam getExam(Long id) {
        return (Exam) redisRepository.getExam(id);
    }

}
