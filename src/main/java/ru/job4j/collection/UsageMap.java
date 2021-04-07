package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Serbin@gmail.com", "Max Serbin");
        map.put("Serbin1@mail.ru", "Max Serbin");
        map.put("Maxxx@yandex.ru", "Max Serbin");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " " + value);
        }
    }
}
