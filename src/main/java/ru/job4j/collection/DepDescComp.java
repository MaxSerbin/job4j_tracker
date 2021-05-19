package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] a = o1.split("/");
        String[] b = o2.split("/");
        if (b[0].equals(a[0])) {
            return a[a.length - 1].compareTo(b[b.length - 1]);
        }
        return b[0].compareTo(a[0]);
    }
}
