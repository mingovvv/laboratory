package onlyme.laboratory.book.effectiveJava.no3;

public class Singleton1 {
    public static final Singleton1 INSTANCE = new Singleton1();

    // private 접근제어자를 통해 외부에서 접근을 불가능 하도록 설정
    private Singleton1() { }

}
