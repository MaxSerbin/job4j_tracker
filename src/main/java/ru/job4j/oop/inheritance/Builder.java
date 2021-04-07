package ru.job4j.oop.inheritance;

public class Builder extends Engineer {

    private String area;

    public Builder(String name, String surname, String education,
                   String birthday, String spec, String area) {
        super(name, surname, education, birthday, spec);
        this.area = area;
    }

    public void build() {

    }
}
