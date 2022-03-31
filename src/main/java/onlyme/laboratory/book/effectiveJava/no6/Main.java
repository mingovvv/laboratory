package onlyme.laboratory.book.effectiveJava.no6;

import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class Main {

    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[a-z0-9_+.-]+@([a-z0-9-]+\\.)+[a-z0-9]{2,4}$");


    public static void main(String[] args) {

        // String 인스턴스를 생성
        String text = new String("hello");

        // 하나의 인스턴스를 재활용, 동일한 문자열 리터럴을 사용하는 모든 코드가 같은 객체임을 보장함
        String text2 = "hello";

        // Boolean 인스턴스를 생성
        Boolean b1 = new Boolean(true);
        System.out.println(b1);

        // Boolean 팩터리 메서드를 사용(만들어진 인스턴스를 참조)
        Boolean b2 = Boolean.valueOf(true);
        System.out.println(b2);

        String text3 = "devyu@gmail.com";
        // String 을 matches 메소드를 통해
        boolean matches = isEmailPattern(text3);
        System.out.println(matches);

        System.out.println(EMAIL_PATTERN.matcher(text3).matches());

        long s = System.currentTimeMillis();
        IntStream.range(1, 10000000).forEach(ss -> text3.matches("^[a-z0-9_+.-]+@([a-z0-9-]+\\.)+[a-z0-9]{2,4}$"));
        long e = System.currentTimeMillis();
        System.out.println("test 1 : " + (e-s));

        long s2 = System.currentTimeMillis();
        IntStream.range(1, 10000000).forEach(ss -> EMAIL_PATTERN.matcher(text3).matches());
        long e2 = System.currentTimeMillis();
        System.out.println("test 2 : " + (e2-s2));

    }

    private static boolean isEmailPattern(String text) {
        return text.matches("^[a-z0-9_+.-]+@([a-z0-9-]+\\.)+[a-z0-9]{2,4}$");
    }

}
