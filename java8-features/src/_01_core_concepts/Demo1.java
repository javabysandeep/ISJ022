package _01_core_concepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);
        numbers.stream()
                .filter(number -> number > 15)
                .map(number -> number * 2)
                .collect(Collectors.toList());
        System.out.println(numbers);

    }
}
