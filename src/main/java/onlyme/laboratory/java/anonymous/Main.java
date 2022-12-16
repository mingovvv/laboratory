package onlyme.laboratory.java.anonymous;

public class Main {
    public static void main(String[] args) {

        A a = new A();
        a.test();

        // 익명클래스 변환
        AInterface aInterface = new AInterface() {
            @Override
            public String test() {
                return "test";
            }
        };

        // lambda 변환
        AInterface aInterface2 = () -> "test";

    }
}

class A implements AInterface {

    @Override
    public String test() {
        return "test";
    }

}
