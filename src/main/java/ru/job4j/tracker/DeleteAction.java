package ru.job4j.tracker;

public class DeleteAction implements UserAction {

    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Delete itemm ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Delete ===");
        int id = Integer.parseInt(input.askStr("Enter id:"));
        boolean del = tracker.delete(id);
        if (del) {
            out.println("Удаление прошло успешно.");
        } else {
            out.println("Ошибка.");
        }
        return true;
    }
}
