package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 300);
        Book book2 = new Book("Holy bible", 500);
        Book book3 = new Book("Head first Java", 715);
        Book book4 = new Book("Grokking algorithms", 288);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getPage());
        }
        System.out.println("Переставить местами книги с индексами [0] и [3].");
        books[0] = book4;
        books[3] = book1;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getPage());
        }
        System.out.println("Цикл с выводом книг с именем Clean code.");
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if(bk.getName().equals("Clean code")) {
                System.out.println(bk.getName() + " - " + bk.getPage());
            }
        }
    }

}
