package ru.job4j.oop.inheritance;

public class Doctor extends Profession {

    private String special;

    public Doctor(String name, String surname, String education, String birthday, String special) {
        super(name, surname, education, birthday);
        this.special = special;
    }

    public String getSpecial() {
        return getInfo() + special;
    }

    public void whoIsThis() {
        System.out.println(getSpecial());
    }

}
