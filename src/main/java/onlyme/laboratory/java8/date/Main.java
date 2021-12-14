package onlyme.laboratory.java8.date;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // 기존의 Date는 mutable 하기 때문에 thread safe 하지 않다.
//        Date now = new Date();
//        System.out.println(now);
//
//        Thread.sleep(3000);
//        Date after3Seconds = new Date();
//        System.out.println(after3Seconds);
//
//        // mutable...
//        after3Seconds.setTime(now.getTime());
//        System.out.println(after3Seconds);

        Instant instant = Instant.now(); // 기준시 UTC, GMT
        System.out.println(instant);

        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.systemDefault());
        System.out.println(zonedDateTime);

        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);

        Period between = Period.between(LocalDate.of(1990, Month.AUGUST, 9), LocalDate.of(1990, Month.AUGUST, 31));
        System.out.println(between.getDays());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/d/yyyy");
        LocalDate date = LocalDate.parse("07/15/1982", formatter);
        System.out.println(date);
        System.out.println(now.format(formatter));

        // stream 요소 합쳐서 분리하기
        StringBuilder sb = new StringBuilder();
        List<String> fruits = List.of("a", "bb", "ccc", "dddd", "eeeee", "ffffff", "ggggggg", "hhhhhhhh", "iiiiiiiii", "jjjjjjjjjj");
        AtomicInteger indexKey = new AtomicInteger(0);
        fruits.stream().collect(Collectors.groupingBy(s -> {
            indexKey.get();
            if (sb.toString().length() + s.length() < 16) {
                sb.append(s);
            } else {
                // 초기화
                sb.setLength(0);
                sb.append(s);
                indexKey.incrementAndGet();
            }
            return indexKey.get();
        })).values().forEach(s -> System.out.println(s));

    }
}
