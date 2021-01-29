package ru.job4j.tracker;

public class ReplaceAction implements UserAction {

    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Replace Itemm ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Replace ===");
        int id = Integer.parseInt(input.askStr("Enter id:"));
        String name = input.askStr("Enter name:");
        Itemm itemm = new Itemm(name);
        if (tracker.replace(id, itemm)) {
            out.println("Замена прошла успешно.");
        } else {
            out.println("Ошибка.");
        }
        return true;
    }
}
