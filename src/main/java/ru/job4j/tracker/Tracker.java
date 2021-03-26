package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public final class Tracker {

    private static Tracker tracker = null;

    private final List<Itemm> items = new ArrayList<>();
    private int ids = 1;

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
            for(Itemm a : items) {
                if(a.getId() == id) {
                    items.remove(a);
                    break;
                }
            }
        }
           return rsl;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId() == id) {
               rsl = index;
               break;
            }
        }
        return rsl;
    }

    public Itemm findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    public List<Itemm> findByName(String key) {
        List<Itemm> name = new ArrayList<>();
        for(Itemm itemm : items) {
          if(itemm.getName().equals(key)) {
              name.add(itemm);
          }
        }
          return List.copyOf(name);
    }

    public List<Itemm> findAll() {
          return List.copyOf(items);


    }
}