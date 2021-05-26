package ru.job4j.lambda;

import java.util.Comparator;
import java.util.Arrays;

public class LambdaUsage {
    public static void main(String[] args) {
        String[] str = {"AAA", "BBBB", "CCCCC"};
        Comparator<String> cmpDescSize = (left, right) -> {
            int first = left.length();
            int second = right.length();
            return Integer.compare(second, first);
        };
        Arrays.sort(str, cmpDescSize);
        for(String i : str) {
            System.out.println(i);
        }

    }
}
