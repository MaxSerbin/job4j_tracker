package ru.job4j.tracker;

import java.util.Scanner;
import java.util.Arrays;

public class StartUIII {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Itemm ===");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
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
                System.out.println("Enter id:");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter name:");
                String name = scanner.nextLine();
                Itemm itemm = new Itemm(name);
                if (tracker.replace(id, itemm)) {
                    System.out.println("Замена прошла успешно.");
                } else {
                    System.out.println("Ошибка.");
                }
            } else if (select == 3) {
                System.out.println("=== Delete itemm ===");
                System.out.println("Enter id:");
                int id = Integer.parseInt(scanner.nextLine());
                boolean del = tracker.delete(id);
                if (del) {
                    System.out.println("Удаление прошло успешно.");
                } else {
                    System.out.println("Ошибка.");
                }
            } else if (select == 4) {
                System.out.println("=== Find itemm by Id ===");
                System.out.println("Enter id:");
                int id = Integer.parseInt(scanner.nextLine());
                Itemm itemm = tracker.findById(id);
                if (itemm != null) {
                    System.out.println(itemm);
                } else {
                    System.out.println("Заявка с таким id не найдена.");
                }
            } else if (select == 5) {
                System.out.println("=== Find itemms by name ===");
                System.out.println("Enter name:");
                String name = scanner.nextLine();
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
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUIII().init(scanner, tracker);
    }
}
