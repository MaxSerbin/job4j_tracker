package ru.job4j.oop.inheritance;

public class Surgeon extends Doctor {

    private String gender;

    public Surgeon(String name, String surname, String education, String birthday, String special, String gender) {
        super(name, surname, education, birthday, special);
        this.gender = gender;
    }

    public void cut() {

    }
}
