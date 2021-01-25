package ru.job4j.tracker;



public class StartUIII implements Input {
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf( input.askStr("Select :"));
            if (select == 0) {
                System.out.println("=== Create a new Itemm ===");
                String name = input.askStr("Enter name: ");
                Itemm itemm = new Itemm(name);
                tracker.add(itemm);
            } else if (select == 1) {
                System.out.println("=== Show all Itemm ===");
                Itemm[] all = tracker.findAll();
                for(int i = 0; i < all.length; i++) {
                    System.out.println(all[i]);
                }
            } else if (select == 2) {
                System.out.println("=== Replace Itemm ===");
                int id = Integer.parseInt(input.askStr("Enter id:"));
                String name = input.askStr("Enter name:");
                Itemm itemm = new Itemm(name);
                if (tracker.replace(id, itemm)) {
                    System.out.println("Замена прошла успешно.");
                } else {
                    System.out.println("Ошибка.");
                }
            } else if (select == 3) {
                System.out.println("=== Delete itemm ===");
                int id = Integer.parseInt(input.askStr("Enter id:"));
                boolean del = tracker.delete(id);
                if (del) {
                    System.out.println("Удаление прошло успешно.");
                } else {
                    System.out.println("Ошибка.");
                }
            } else if (select == 4) {
                System.out.println("=== Find itemm by Id ===");
                int id = Integer.parseInt(input.askStr("Enter id:"));
                Itemm itemm = tracker.findById(id);
                if (itemm != null) {
                    System.out.println(itemm);
                } else {
                    System.out.println("Заявка с таким id не найдена.");
                }
            } else if (select == 5) {
                System.out.println("=== Find itemms by name ===");
                String name = input.askStr("Enter name:");
               Itemm[] names = tracker.findByName(name);
                if (names.length > 0) {
                    for(int i = 0; i < names.length; i++) {
                        System.out.println(names[i]);
                    }
                } else {
                    System.out.println("Заявки с таким именем не найдены.");
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu:");
        System.out.println("0. Add new Itemm");
        System.out.println("1. Show all itemms");
        System.out.println("2. Edit itemm");
        System.out.println("3. Delete itemm");
        System.out.println("4. Find itemm by Id");
        System.out.println("5. Find itemms by name");
        System.out.println("6. Exit Program");
    }


    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUIII().init(input, tracker);
    }

    @Override
    public String askStr(String question) {
        return null;
    }

    @Override
    public int askInt(String question) {
        return 0;
    }
}
