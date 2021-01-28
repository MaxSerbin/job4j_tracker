package ru.job4j.tracker;

public class ReplaceAction implements UserAction {

    @Override
    public String name() {
        return "=== Replace Itemm ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.parseInt(input.askStr("Enter id:"));
        String name = input.askStr("Enter name:");
        Itemm itemm = new Itemm(name);
        if (tracker.replace(id, itemm)) {
            System.out.println("Замена прошла успешно.");
        } else {
            System.out.println("Ошибка.");
        }
        return true;
    }
}
