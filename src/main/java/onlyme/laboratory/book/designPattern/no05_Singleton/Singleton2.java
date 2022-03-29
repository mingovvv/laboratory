package onlyme.laboratory.book.designPattern.no05_Singleton;

// 싱글톤
public class Singleton2 {

    private static Singleton2 SINGLETON = null;

    private Singleton2() { // 외부에서 `new` keyword를 통해 instance를 생성하지 못하도록 접근제어자를 private 설정한다.
        System.out.println("singleton instance is created.");
    }

    public static synchronized Singleton2 getInstance() { // `synchronized` keyword를 통해 thread safety 보증
        if (SINGLETON == null) {
            SINGLETON = new Singleton2();
        }
        return SINGLETON;
    }
}
