package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Tracker {

    private static Tracker tracker = null;

 //   private final Itemm[] items = new Itemm[100];
    List<Itemm> items = new ArrayList<>();
    private int ids = 1;
    private int size = 0;

    private Tracker() {

    }

    public static Tracker getTracker() {
        if (tracker == null) {
            tracker = new Tracker();
        }
        return tracker;
    }


    public Itemm add(Itemm itemm) {
        itemm.setId(ids++);
   //     items.set(size++, itemm);
        items.add(itemm);
        return itemm;
    }

    public boolean replace(int id, Itemm itemm) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            itemm.setId(id);
            items.set(index, itemm);
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
   //         int startPos = index + 1;
   //         int distPos = index;
    //        int length = size - index;
    //        System.arraycopy(items, startPos, items, distPos, length);
   //         items.set(size - 1, null);
   //         size--;
            items.remove(index);
        }
            return rsl;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items.get(index).getId() == id) {
               rsl = index;

                break;
            }
        }
        return rsl;
  //      return items.indexOf(id);
    }

    public Itemm findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    public List<Itemm> findByName(String key) {
 //       Itemm[] name = new Itemm[size];
 //       List<Itemm> name = new ArrayList<>(size);
        List<Itemm> name = new ArrayList<>();
        int i = 0;
        for(int index = 0; index < size; index++) {
          Itemm itemm = items.get(index);
          if(itemm.getName().equals(key)) {
              name.set(i, itemm);
              i++;
          }
        }
 //       return Arrays.copyOf(name, i);
          return (List<Itemm>) name.get(i);
    }

    public List<Itemm> findAll() {
  //      return Arrays.copyOf(items, size);
          return items;


    }
}