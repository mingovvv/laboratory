package onlyme.laboratory.java8.functionalInterface.biFunction;

import java.util.function.BiFunction;

/**
 *  BiFunction<T, U, R>
 *  T 타입과  U 타입을 받아서 R 타입을 리턴하는 함수형 인터페이스
 */
public class aPlusb implements BiFunction<Integer, Integer, Integer> {

    @Override
    public Integer apply(Integer integer, Integer integer2) {
        return integer + integer2;
    }

}
