package ru.job4j.function;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> biCon = (a, b) -> map.put(a, b);
        biCon.accept(1, "one");
        biCon.accept(2, "two");
        biCon.accept(3, "three");
        biCon.accept(4, "four");
        biCon.accept(5, "five");
        biCon.accept(6, "six");
        biCon.accept(7, "seven");

        BiPredicate<Integer, String> biPred = (i, s) -> (i % 2 == 0 || map.get(i).length() == 4);
        System.out.println(biPred.test(1, "one"));
        System.out.println(biPred.test(2, "two"));
        System.out.println(biPred.test(3, "three"));
        System.out.println(biPred.test(4, "four"));
        System.out.println(biPred.test(5, "five"));
        System.out.println(biPred.test(6, "six"));
        System.out.println(biPred.test(7, "seven"));

        Supplier<List<String>> sup = () -> new ArrayList<>(map.values());
        Consumer<String> con = (s) -> System.out.println(s);
        con.accept(String.valueOf(sup.get()));
        Function<String, String> func = s -> s.toUpperCase();
        System.out.println(func.apply(String.valueOf(sup.get())));

    }
}
