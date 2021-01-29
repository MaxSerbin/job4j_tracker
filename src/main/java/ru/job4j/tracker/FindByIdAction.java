package ru.job4j.tracker;

public class FindByIdAction implements UserAction {

    private final Output out;

    public FindByIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Find itemm by Id ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find by Id ===");
        int id = Integer.parseInt(input.askStr("Enter id:"));
        Itemm itemm = tracker.findById(id);
        if (itemm != null) {
            out.println(itemm);
        } else {
            out.println("Заявка с таким id не найдена.");
        }
        return true;
    }
}
