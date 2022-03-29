package onlyme.laboratory.book.designPattern.no05_Singleton;

public class SingletonStarter {
    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance(); // 최초로 getInstance() 메소드가 호출될 때, Singleton Instance가 초기화된다.
        Singleton instance2 = Singleton.getInstance();

        if (instance1 == instance2) {
            System.out.println("동일한 인스턴스");
        } else {
            System.out.println("동일하지 않은 인스턴스");
        }
    }
}
