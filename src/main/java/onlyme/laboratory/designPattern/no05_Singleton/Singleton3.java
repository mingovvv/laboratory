package onlyme.laboratory.designPattern.no05_Singleton;

// 싱글톤(double checked locking)
public class Singleton3 {

    // `volatile` Java 1.5 이상에서 사용 가능
    private static volatile Singleton3 singleton = null;

    private Singleton3() { // 외부에서 `new` keyword를 통해 instance를 생성하지 못하도록 접근제어자를 private 설정한다.
        System.out.println("singleton instance is created.");
    }

    public static Singleton3 getInstance() { // getInstance 메소드가 실행될 때마다 매번 synchronized가 걸리는 것은 아니라서 더 효울적인 방법...
        if (singleton == null) {
            synchronized (Singleton3.class) { // `synchronized` 동기화 블럭을 통한 double checking
                if (singleton == null) {
                    singleton = new Singleton3();
                }
            }
        }
        return singleton;
    }
}
