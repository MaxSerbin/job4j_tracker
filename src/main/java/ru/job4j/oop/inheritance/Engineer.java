package ru.job4j.oop.inheritance;

public class Engineer extends Profession {

    private String spec;

    public Engineer(String name, String surname, String education, String birthday, String spec) {
        super(name, surname, education, birthday);
        this.spec = spec;
    }

    public String getSpec() {
        return getInfo() + spec;
    }

    public void whoIsThis() {
        System.out.println(getSpec());
    }

}






