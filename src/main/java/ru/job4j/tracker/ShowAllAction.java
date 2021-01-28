package ru.job4j.tracker;

public class ShowAllAction implements UserAction {

    @Override
    public String name() {
        return "=== Show all Itemm ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Itemm[] all = tracker.findAll();
        for(int i = 0; i < all.length; i++) {
            System.out.println(all[i]);
        }
        return true;
    }
}
