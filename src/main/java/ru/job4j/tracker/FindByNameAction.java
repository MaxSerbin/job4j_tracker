package ru.job4j.tracker;

public class FindByNameAction implements UserAction {

    @Override
    public String name() {
        return "=== Find itemms by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name:");
        Itemm[] names = tracker.findByName(name);
        if (names.length > 0) {
            for(int i = 0; i < names.length; i++) {
                System.out.println(names[i]);
            }
        } else {
            System.out.println("Заявки с таким именем не найдены.");
        }
        return true;
    }
}
