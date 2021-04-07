package ru.job4j.tracker;

import java.util.List;

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
        List<Itemm> names = tracker.findByName(name);
        if (names.size() > 0) {
            for (int i = 0; i < names.size(); i++) {
                out.println(names.get(i));
            }
        } else {
            out.println("Заявки с таким именем не найдены.");
        }
        return true;
    }
}
