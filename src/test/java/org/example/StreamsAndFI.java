package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsAndFI {

    @Test
    void funcInterfaces() {
        Function<String, Integer> strToInt = s -> Integer.valueOf(s);
        Assertions.assertEquals(123, strToInt.apply("123"));

        Function<String, Integer> strToInt2 = s -> {
            Integer a = Integer.valueOf(s);
            return a + 100;
        };
        Assertions.assertEquals(111, strToInt2.apply("11"));

        Predicate<Integer> filterLessThree = x -> x < 3;
        Assertions.assertFalse(filterLessThree.test(5));

        BiFunction<Integer, Integer, String> sumAndStringify = (a, b) -> {
            Integer i = a + b;
            return i.toString();
        };


    }

    @Test
    void streams(){
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        List<String> listStream = stream.filter(x -> x % 3 == 0)
                .map(x -> x + 100)
                .map(Object::toString)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

    @Test
    void stream(){
        Optional<Integer> intp = Stream.of(1,2,3,4,5)
                .reduce((x,y) -> x + y);
        System.out.println(intp.get());
    }


}
