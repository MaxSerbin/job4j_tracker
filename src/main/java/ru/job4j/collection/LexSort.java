package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] strL = left.split(". ");
        String[] strR = right.split(". ");

        return Integer.compare(Integer.parseInt(strL[0]), Integer.parseInt(strR[0]));
    }
}
