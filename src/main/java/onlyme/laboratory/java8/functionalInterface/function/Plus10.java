package onlyme.laboratory.java8.functionalInterface.function;

import java.util.function.Function;

/**
 *  Function<T, R>
 *  T 타입을 받아서 R 타입을 리턴하는 함수형 인터페이스
 */
public class Plus10 implements Function<Integer, Integer> {

    @Override
    public Integer apply(Integer integer) {
        return integer + 10;
    }

}
