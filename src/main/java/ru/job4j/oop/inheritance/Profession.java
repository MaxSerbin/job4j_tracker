package ru.job4j.oop.inheritance;

public class Profession {

    private String name;
    private String surname;
    private String education;
    private String birthday;

    public Profession(String name, String surname, String education, String birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
    }

    public String getInfo() {
        return name + surname + education + birthday;
    }

    public void show() {
        System.out.println(getInfo());
    }

    public static void main(String[] args) {
        Profession pro = new Profession("John ", "Connor ", "savior ", "02.08.1977");
        pro.show();
    }
}
