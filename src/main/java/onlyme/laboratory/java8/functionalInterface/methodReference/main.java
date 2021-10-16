package onlyme.laboratory.java8.functionalInterface.methodReference;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 * 람다가 하는 일이 기존 메소드 또는 생성자를 호출하는 거라면, 메소드 레퍼런스를 사용해서 매우 간결하게 표현할 수 있다.
 * ● 메소드 또는 생성자의 매개변수로 람다의 입력값을 받는다.
 * ● 리턴값 또는 생성한 객체는 람다의 리턴값이다.
 */
public class main {

    public static void main(String[] args) {
        UnaryOperator<String> hi = s -> s + ", 안녕?";
        // 스태틱 메소드 참조 (타입::스태틱 메소드)
        UnaryOperator<String> hi2 = Hello::informalSpeech;

        Hello hello = new Hello();
        // 인스턴스 메소드 참조 (객체 래퍼런스::인스턴스 메소드)
        UnaryOperator<String> hi3 = hello::politeSpeech;

        // 기본생성자 사용 (타입::인스턴스 메소드)
        Supplier<Hello> helloSupplier = Hello::new;

        // 생성자 사용 (타입::인스턴스 메소드)
        Function<String, Hello> stringHelloFunction = Hello::new;

        String[] names = {"ddddd", "ggggggg", "aaaaaaaaa"};
//        Arrays.sort(names, (o1, o2) -> o1.compareToIgnoreCase(o2));
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
    }

}
