package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {

    private final Itemm[] items = new Itemm[100];
    private int ids = 1;
    private int size = 0;


    public Itemm add(Itemm itemm) {
        itemm.setId(ids++);
        items[size++] = itemm;
        return itemm;
    }

    public Itemm findById(int id) {
        Itemm rsl = null;
        for (int index = 0; index < size; index++) {
            Itemm itemm = items[index];
            if (itemm.getId() == id) {
                rsl = itemm;
                break;
            }
        }
        return rsl;
    }

    public Itemm[] findByName(String key) {
        Itemm[] name = new Itemm[size];
        int i = 0;
        for(int index = 0; index < size; index++) {
          Itemm itemm = items[i];
          if(itemm.getName().equals(key)) {
              name[i] = itemm;
              i++;
          }
        }
        return Arrays.copyOf(name, size);

    }

    public Itemm[] findAll() {

        return Arrays.copyOf(items, size);
    }
}