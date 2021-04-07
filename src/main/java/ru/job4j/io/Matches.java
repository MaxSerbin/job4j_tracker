package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок," : "Второй игрок,";
            if (count >= 3) {
                System.out.println(player + " введите число от 1 до 3:");
            } else {
                System.out.println(player + " введите число от 1 до " + count + ":");
            }
            int matches = Integer.parseInt(input.nextLine());
            if (matches < 1 || matches > 3 || matches > count) {
                System.out.println("Вы ввели неверное число.");
            } else {
                count -= matches;
                System.out.println("Осталось " + count + " спичек.");
                turn = !turn;
            }

        }
        if (!turn) {
            System.out.println("Выиграл Первый игрок");
        } else {
            System.out.println("Выиграл Второй игрок");
        }
    }

}
