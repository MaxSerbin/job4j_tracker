package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class StreamUsage {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(-1);
        nums.add(2);
        nums.add(-500);
        nums.add(3);
        List<Integer> posNum = nums.stream().filter(
                n -> n > 0).collect(Collectors.toList());
        posNum.forEach(System.out::println);

    }
}
