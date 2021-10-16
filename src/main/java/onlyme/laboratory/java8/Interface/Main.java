package onlyme.laboratory.java8.Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class Main {

    public static void main(String[] args) {

        Test test = new Test();
        test.printNameUppercase();
        TestInterface.printNameLowercase();

        List<String> names = new ArrayList<>();
        names.add("min");
        names.add("devyu");
        names.add("puregyu");

        names.forEach(System.out::println);

        Spliterator<String> spliterator = names.spliterator();
        Spliterator<String> stringSpliterator = spliterator.trySplit();

        System.out.println("===");
        while (spliterator.tryAdvance(System.out::println));
        System.out.println("===");
        while (stringSpliterator.tryAdvance(System.out::println));
        System.out.println("===");

    }

}

