package ru.job4j.tracker;

public class FindByIdAction implements UserAction {

    @Override
    public String name() {
        return "=== Find itemm by Id ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.parseInt(input.askStr("Enter id:"));
        Itemm itemm = tracker.findById(id);
        if (itemm != null) {
            System.out.println(itemm);
        } else {
            System.out.println("Заявка с таким id не найдена.");
        }
        return true;
    }
}
