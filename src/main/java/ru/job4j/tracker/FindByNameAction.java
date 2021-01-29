package ru.job4j.tracker;

public class FindByNameAction implements UserAction {

    private final Output out;

    public FindByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Find itemms by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find by name ===");
        String name = input.askStr("Enter name:");
        Itemm[] names = tracker.findByName(name);
        if (names.length > 0) {
            for(int i = 0; i < names.length; i++) {
                out.println(names[i]);
            }
        } else {
            out.println("Заявки с таким именем не найдены.");
        }
        return true;
    }
}
