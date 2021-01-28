package ru.job4j.tracker;

public class CreateAction implements UserAction {

    @Override
    public String name() {
        return "=== Create a new Itemm ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Itemm itemm = new Itemm(name);
        tracker.add(itemm);
        return true;
    }
}
