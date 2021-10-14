package onlyme.laboratory.java8.functionalInterface.consumer;

import java.util.function.Consumer;

/**
 * 입력값만 존재하는 함수형 인터페이스
 */
public class main {
    public static void main(String[] args) {

        Consumer<Integer> plus10Println = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer + 10);
            }
        };

        Consumer<Integer> plus10PrintlnByLambda = integer -> System.out.println(integer + 10);

    }
}
