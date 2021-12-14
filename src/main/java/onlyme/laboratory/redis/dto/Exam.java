package onlyme.laboratory.redis.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Exam {

    private Long studentId;
    private String name;
    private String grade;
    private int age;
    private String test;

    public Exam() {
    }

    @Builder
    public Exam(Long studentId, String name, String grade, int age) {
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
        this.age = age;
    }

}
