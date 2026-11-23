package _01_core_concepts;

import java.util.*;
import java.util.stream.*;

public class Demo02 {
    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(1, 2, 3, 4, 5);

        Stream<Integer> stream = numbers.stream()
                .filter(n -> {
                    System.out.print("F" + n + " ");
                    return n % 2 == 0;
                })
                .map(n -> {
                    System.out.print("M" + n + " ");
                    return n * 2;
                });

        System.out.println("Start");

        List<Integer> result = stream.collect(Collectors.toList());

        System.out.println();
        System.out.println(result);
    }
}
