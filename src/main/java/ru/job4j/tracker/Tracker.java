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

        Itemm rsl = null;
        Itemm[] name = new Itemm[items.length];
        for(int i = 0; i < size; i++) {
          Itemm itemm = items[i];
          if(itemm.getName() == key) {
              rsl = itemm;
              break;
          }
        }
        return Arrays.copyOf(items, size);

    }

    public Itemm[] findAll() {
         Itemm[] fAll = new Itemm[items.length];
         for(int i = 0; i < size; i++) {
         }
        return Arrays.copyOf(items, size);
    }
}