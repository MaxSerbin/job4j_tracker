package ru.job4j.ex;

public class Find {
    public static String get(String[] data, int index) throws IllegalArgumentException {
        if (index < 0 || index >= data.length) {
            throw new IllegalArgumentException("Index out of bound");
        }
        return data[index];
    }

    public static void main(String[] args) {
        String[] data = {"one", "two", "three"};
        try {
            System.out.println(Find.get(data, 0));
            System.out.println(Find.get(data, -1));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}

