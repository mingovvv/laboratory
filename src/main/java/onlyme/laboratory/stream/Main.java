package onlyme.laboratory.stream;

import org.checkerframework.checker.regex.qual.Regex;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        String searchId = "20220811111,20220811112,20220711113,20220711114,20220611115,202201123456";
        String[] split = searchId.split("[,]");

        
//        Map<String, List<String>> collect = Arrays.stream(split).collect(Collectors.groupingBy(s -> s.substring(0, 6), Collectors.filtering(s -> s.length() > 6 && isMonth(s), Collectors.toList())));
//        System.out.println(collect);


    }

    private static boolean isMonth(String s) {
        String month = s.substring(0, 6);
        Pattern pattern = Pattern.compile("[20]\\d{2}");
        Matcher m = pattern.matcher(s);
        return m.find();
    }

}