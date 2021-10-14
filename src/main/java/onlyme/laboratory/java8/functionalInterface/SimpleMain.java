package onlyme.laboratory.java8.functionalInterface;

public class SimpleMain {

    public static void main(String[] args) {
        // 익명 내부클래스(Anonymous Inner Class)
        SimpleInterface simpleInterface = new SimpleInterface() {
            @Override
            public void doIt() {
                System.out.println("hello");
            }
        };

        // 함수형 인터페이스를 구현할 때, 줄여서 사용
        SimpleInterface runSomethingByLambdaExpression = () -> System.out.println("hello");
    }

}
