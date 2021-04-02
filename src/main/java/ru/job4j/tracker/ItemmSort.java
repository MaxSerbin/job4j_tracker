package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

public class ItemmSort {
    public static void main(String[] args) {
        List<Itemm> items = Arrays.asList(new Itemm(3, "CCC"),
                new Itemm(2, "BBB"), new Itemm(1, "AAA"));
        System.out.println(items);
        Collections.sort(items);
        System.out.println(items);
        Collections.sort(items, Collections.reverseOrder());
        System.out.println(items);

    }
}
