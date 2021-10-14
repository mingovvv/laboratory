package onlyme.laboratory.java8.functionalInterface.suppiler;

import java.util.function.Supplier;

/**
 *  Supplier<T>
 *  타입을 받지않고 T 타입을 반환하는 함수형 인터페이스
 */
public class return10 implements Supplier<Integer> {

    @Override
    public Integer get() {
        return 10;
    }
}
