package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        char[] leftL = left.toCharArray();
        char[] rightR = right.toCharArray();
        int rsl = 0;
        int shortLn = Math.min(leftL.length, rightR.length);
            for (int i = 0; i < shortLn; i++) {
                rsl = Character.compare(leftL[i], rightR[i]);
                if (rsl != 0) {
                    break;
                }
            }
             if (rsl == 0 && leftL.length != rightR.length) {
                 rsl = Integer.compare(leftL.length, rightR.length);
             }
        return rsl;
    }
}