package onlyme.laboratory.java8.functionalInterface.suppiler;

import java.util.function.Supplier;

/**
 * 입력값이 없으며 반환값만 존재하는 함수형 인터페이스
 */
public class main {
    public static void main(String[] args) {

        Supplier<Integer> return10 = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 10;
            }
        };

        Supplier<Integer> return10ByLambda = () -> 10;

    }
}
