package onlyme.laboratory.book.effectiveJava.no5;

public class Main {
    public static void main(String[] args) {
//        Student student = new Student(1L, "장규민", 10);

        // 플루언트(fluent) API 또는 메서드 연쇄(method chaining)
        new Student.Builder()
                .studentId(1L)
                .name("장규민")
                .height(182)
                .weight(120)
                .builder();

    }
}
