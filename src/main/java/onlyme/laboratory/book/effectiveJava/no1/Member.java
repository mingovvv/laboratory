package onlyme.laboratory.book.effectiveJava.no1;

public class Member {

    private String name;
    private int age;

    private Member() {
    }

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Member getInstance() {
        return new Member();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
