package onlyme.laboratory.java8.functionalInterface.consumer;

import java.util.function.Consumer;

/**
 *  Consumer<T>
 *  T 타입을 받아서 수행하는 함수형 인터페이스
 */
public class Plus10Println implements Consumer<Integer> {

    @Override
    public void accept(Integer integer) {
        System.out.println(integer + 10);
    }

}
