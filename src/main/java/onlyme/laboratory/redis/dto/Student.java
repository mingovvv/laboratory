package onlyme.laboratory.redis.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Student {

    private Long studentId;
    private String name;
    private int age;

    public Student() {
    }

    @Builder
    public Student(Long studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
    }

}
