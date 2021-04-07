package ru.job4j.tracker;

import java.util.List;

public class ShowAllAction implements UserAction {

    private final Output out;

    public ShowAllAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Show all Itemm ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Show All ===");
        List<Itemm> all = tracker.findAll();
        for (int i = 0; i < all.size(); i++) {
            out.println(all.get(i));
        }
        return true;
    }
}
