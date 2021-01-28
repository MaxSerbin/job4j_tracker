package ru.job4j.tracker;

public class DeleteAction implements UserAction {

    @Override
    public String name() {
        return "=== Delete itemm ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.parseInt(input.askStr("Enter id:"));
        boolean del = tracker.delete(id);
        if (del) {
            System.out.println("Удаление прошло успешно.");
        } else {
            System.out.println("Ошибка.");
        }
        return true;
    }
}
