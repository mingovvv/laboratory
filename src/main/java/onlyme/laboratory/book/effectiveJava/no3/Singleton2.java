package onlyme.laboratory.book.effectiveJava.no3;

public class Singleton2 {
    public static final Singleton2 INSTANCE = new Singleton2();

    // private 접근제어자를 통해 외부에서 접근을 불가능 하도록 설정
    private Singleton2() { }

}
