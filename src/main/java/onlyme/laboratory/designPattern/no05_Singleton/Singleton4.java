package onlyme.laboratory.designPattern.no05_Singleton;

// 싱글톤(static inner class, 권장되는 방법)
public class Singleton4 {

    private Singleton4() {
        System.out.println("singleton instance is created.");
    }

    private static class Singleton4Holder {
        private static final Singleton4 SINGLETON = new Singleton4();
    }

    public static Singleton4 getInstance() { // method 호출 시점에 class 로딩이되며 인스턴스 생성(Lazy loading)
        return Singleton4Holder.SINGLETON;
    }

}
