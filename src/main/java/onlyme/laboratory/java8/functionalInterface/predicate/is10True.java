package onlyme.laboratory.java8.functionalInterface.predicate;

import java.util.function.Predicate;

/**
 *  Predicate<T>
 *  T 타입을 받아서 boolean 타입을 반환하는 함수형 인터페이스
 */
public class is10True implements Predicate<Integer> {

    @Override
    public boolean test(Integer integer) {
        return integer == 10;
    }

}
