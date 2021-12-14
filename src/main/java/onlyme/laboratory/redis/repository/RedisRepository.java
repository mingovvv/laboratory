package onlyme.laboratory.redis.repository;

import onlyme.laboratory.redis.dto.Exam;
import onlyme.laboratory.redis.dto.Student;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class RedisRepository {

    private static final Map<Long, Object> db = new HashMap<>() {{
        put(1L, Student.builder().studentId(1L).name("민").age(22).build());
        put(2L, Student.builder().studentId(2L).name("규").age(22).build());
        put(3L, Exam.builder().studentId(1L).name("민").age(22).grade("A").build());
        put(4L, Exam.builder().studentId(2L).name("규").age(22).grade("B").build());
    }};

    @Cacheable(value = "cachingA", key = "#id")
    public Object getStudent(Long id) {
        return db.get(id);
    }

    @Cacheable(value = "cachingB", key = "#id")
    public Object getExam(Long id) {
        return db.get(id);
    }

}
