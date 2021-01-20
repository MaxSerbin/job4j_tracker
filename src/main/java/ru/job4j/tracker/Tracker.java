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

    public boolean replace(int id, Itemm itemm) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            itemm.setId(id);
            items[index] = itemm;
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            int startPos = index + 1;
            int distPos = index;
            int length = size - index;
            System.arraycopy(items, startPos, items, distPos, length);
            items[size - 1] = null;
            size--;
        }
            return rsl;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Itemm findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Itemm[] findByName(String key) {
        Itemm[] name = new Itemm[size];
        int i = 0;
        for(int index = 0; index < size; index++) {
          Itemm itemm = items[index];
          if(itemm.getName().equals(key)) {
              name[i] = itemm;
              i++;
          }
        }
        return Arrays.copyOf(name, i);

    }

    public Itemm[] findAll() {

        return Arrays.copyOf(items, size);
    }
}