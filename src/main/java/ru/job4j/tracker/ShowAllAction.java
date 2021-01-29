package ru.job4j.tracker;

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
        Itemm[] all = tracker.findAll();
        for(int i = 0; i < all.length; i++) {
            out.println(all[i]);
        }
        return true;
    }
}
