package ru.job4j.tracker;

public class StartUII {
    public static void main(String[] args) {

        Tracker tracker = new Tracker();
        Itemm itemm = new Itemm();
        itemm.setName("Book");
        itemm.setId(1);
        tracker.add(itemm);
        System.out.println(tracker.findById(1));


    }
}
