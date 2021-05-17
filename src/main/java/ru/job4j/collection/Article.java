package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;

public class Article {
    public static boolean generateBy(String origin, String line) {
      boolean rsl = true;
      String[] orig = origin.split("[., :;!]");
      String[] text = line.split("[., :;!]");
      HashSet<String> check = new HashSet<>();
      check.addAll(Arrays.asList(orig));
      for(String txt : text) {
          if(!check.contains(txt)) {
                rsl = false;
                break;
          }
      }
        return rsl;
    }
}
