package onlyme.laboratory.java8.functionalInterface;

import java.util.function.Consumer;

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

        run();
    }

    private static void run() {

        // final 키워드가 없어도 로컬클래스, 익명클래스, 람다 모두 참조가 가능하다.
        // 사실상 final 이여야 함.(expected final)
        int baseNumber = 10;

        // 로컬 클래스, 쉐도잉 가능
        class LocalClass {
            void printBaseNumber() {
                int baseNumber = 11;
                System.out.println(baseNumber); // 11
            }
        }

        // 익명 클래스, 쉐도잉 가능
        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                int baseNumber = 11;
                System.out.println(baseNumber); // 11
            }
        };

        // 람다, 쉐도잉 불가능
        Consumer<Integer> consumer2 = integer -> {
//            int baseNumber = 11; // 람다는 run() 메소드와 같은 scope 라서 쉐도잉이 불가능함. 컴파일 에러 발생
            System.out.println(baseNumber);
        };
    }

}
