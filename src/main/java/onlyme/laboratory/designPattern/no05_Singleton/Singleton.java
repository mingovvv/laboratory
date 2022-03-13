package onlyme.laboratory.designPattern.no05_Singleton;

// 싱글톤(이른 초기화, eager initialization)
public class Singleton {

    private static final Singleton SINGLETON = new Singleton();

    private Singleton() { // 외부에서 new keyword를 통해 instance를 생성하지 못하도록 접근제어자를 private 설정한다.
        System.out.println("singleton instance is created.");
    }

    public static Singleton getInstance() {
        return SINGLETON;
    }
}
