package ru.job4j.poly;

public class Train implements Vehicle {

    public void move() {
        System.out.println(getClass().getSimpleName() + " передвигается по рельсам.");
    }

    public void speed() {
        System.out.println(getClass().getSimpleName() + " 80 km/h.");
    }
}
