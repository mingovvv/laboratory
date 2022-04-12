package onlyme.laboratory.book.effectiveJava.no7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] a = {"a", "b"};
        System.out.println(Arrays.asList(a));
        String[] b = Arrays.copyOf(a, 2 * a.length + 1);
        System.out.println(Arrays.asList(b));
        System.out.println(a != b);
    }
}
