package onlyme.laboratory.java8.functionalInterface.function;

import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * 입력값과 반환값이 둘 다 존재하는 함수형 인터페이스
 */
public class main {
    public static void main(String[] args) {

        // 인터페이스를 구현한 클래스를 직접 사용
        Plus10 plus10 = new Plus10();
        Integer result = plus10.apply(10);


        // 익명 내부클래스 방식
        Function<Integer, Integer> plus10v1 = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer + 10;
            }
        };


        // 람다표현식을 사용한 방식
        Function<Integer, Integer> plus10v2 = (integer) -> {
            return integer + 10;
        };


        // 람다표현식을 사용한 방식 (중괄호 안이 1line이라면 줄일 수 있음)
        Function<Integer, Integer> plus10v3 = (integer) -> integer + 10;


        // *tip : 입력값과 반환값 타입이 같으면
        UnaryOperator<Integer> unaryOperator = (integer) -> integer + 10;


        // [함수 조합 메소드]
        Function<Integer, Integer> multiply2 = (integer) -> integer * 2;
        Function<Integer, Integer> minus1 = (integer) -> integer - 1;

        // compose method
        // 입력값을 바탕으로 뒤의 인자의 함수형 인터페이스를 실행하고 결과값을 다시 앞의 함수형 인터페이스의 입력값으로 사용한다.
        // value -> minus1 function interface -> result -> multiply2 function interface -> result
        // (x-1)*2
        Function<Integer, Integer> minus1AndMultiply2 = multiply2.compose(minus1);
        System.out.println(minus1AndMultiply2.apply(10));

        // andThen method
        // 입력값을 바탕으로 앞의 인자의 함수형 인터페이스를 실행하고 결과값을 다시 뒤의 함수형 인터페이스의 입력값으로 사용한다.
        // value -> minus1 function interface -> result -> multiply2 function interface -> result
        // (x-1)*2
        Function<Integer, Integer> multiply2Andminus1 = multiply2.andThen(minus1);
        System.out.println(multiply2Andminus1.apply(10));


    }
}
