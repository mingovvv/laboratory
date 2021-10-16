package onlyme.laboratory.java8.optional;

import java.util.Optional;
import java.util.OptionalInt;

public class Main {
    public static void main(String[] args) {

        OnlineClass onlineClass = new OnlineClass(1L, "java", false);
//        onlineClass.getProgress().getStudyDuration(); // 런타임 에러 발생(NPE), null을 참조할 수 없다.

        // [Optional 꿀팁]
        // 1. Optional의 경우, 리턴값으로만 사용하는 것을 권장한다. (메소드 매개변수 타입, 맵의 키 타입, 인스턴스 필드 타입 금지!!!)
        onlineClass.setProgress(null);

        // 2. primitive 타입의 경우 전용 Optional을 사용하자.
        Optional.of(10); // X, boxing, unboxing 과정이 발생.. 성능상 이슈
        OptionalInt.of(10); // O

        // 3. Optinal을 리턴하는 메소드에서 null을 리턴하는건 바보.. Optional.empty(); 사용하자... 이유는 사용하는쪽에서 null 체크를 또 해야하는거라서..

        // 4. 비어있다는 것을 알수있는 타입들은 Optional로 감싸줄 필요가 없음. (ex. Collection, Map, Array, Optional)

        // [Optional method]
        // 1. orElse 메소드는 동작원리를 생각하고 사용하자.
//        Optional<String> optionals = Optional.of("Test");
        Optional<String> optionals = Optional.ofNullable(null);
        System.out.println(optionals.orElse(testMethod()));

        // 2. orElseGet 메소드는 존재하는 경우 supplier를 실행하지 않는다.
        Optional<String> optionals2 = Optional.of("Test");
        System.out.println(optionals2.orElseGet(Main::testMethod));
    }

    private static String testMethod() {
        System.out.println("pre execute"); // orElse 경우 무조건 실행됨.
        return "optionals는 비어있습니다.";
    }
}
