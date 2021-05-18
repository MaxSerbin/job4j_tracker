package ru.job4j.collection;

import java.util.HashMap;


public class FreezeStr {
    public static boolean eq(String left, String right) {
        HashMap<Character, Integer> map = new HashMap<>();
        if (left.length() != right.length()) {
            return false;
        }
        for (Character c : left.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        for (Character c : right.toCharArray()) {
            if (!map.containsKey(c)) {
                return false;
            } else {
               map.put(c, map.get(c) - 1);
            }
            if (map.containsKey(c) || map.get(c) == 1) {
                map.remove(c);

            }
        }
        for (Character c : map.keySet()) {
            if (!map.isEmpty()) {
                return false;
            }
        }
        return true;
    }
}
