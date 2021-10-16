package onlyme.laboratory.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 *  Stream
 *   - Funtional in nature, 스트림이 처리하는 데이터 소스를 변경하지 않는다.
 *   - 스트림으로 처리하는 데이터는 오직 한번만 처리한다.
 *   - 중개 오퍼레이션은 근본적으로 lazy 하다.
 *   - 중개 오페이션은 Stream을 리턴하고 종료 오퍼레이션은 Stream 외의 타입을 리턴한다.
 *   - 병렬처리 가능(parallelStream())
 */
public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("min");
        names.add("devyu");
        names.add("puregyu");

        // 중개 오퍼레이션은 근본적으로 lazy 하다.
        names.stream().map(s -> {
            System.out.println(s); // 종료 오퍼레이션이 나오기전까지 실행되지 않는다. -> 즉 종료 오퍼레이션이 필수
            return s.toUpperCase();
        });

        System.out.println("==========================");

        // 병렬처리 가능(parallelStream())
        names.parallelStream().map(s -> {
            System.out.println("parallelStream() -> thread name : " + Thread.currentThread().getName());
            return s.toUpperCase();
        }).collect(Collectors.toList());

        names.stream().map(s -> {
            System.out.println("stream() -> thread name : " + Thread.currentThread().getName());
            return s.toUpperCase();
        }).collect(Collectors.toList());

        // example
        // flatmap

        System.out.println("==========================");

        List<String> sports = new ArrayList<>(){
            {
                add("tennis");
                add("baseball");
                add("soccer");
            }
        };

        List<String> fruits = new ArrayList<>(){
            {
                add("apple");
                add("banana");
                add("orange");
                add("melon");
            }
        };

        List<List<String>> favoriteThings = new ArrayList<>(Arrays.asList(sports, fruits));

        favoriteThings.stream()
                .flatMap(Collection::stream) // 다 펼쳐버려..
                .forEach(System.out::println);

    }
}
