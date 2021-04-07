package ru.job4j.oop.inheritance;

public class Dantist extends Doctor {

    private String exp;

    public Dantist(String name, String surname, String education,
                   String birthday, String special, String exp) {
        super(name, surname, education, birthday, special);
        this.exp = exp;
    }

    public void toHurt() {

    }
}
