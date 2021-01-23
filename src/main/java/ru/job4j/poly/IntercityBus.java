package ru.job4j.poly;

public class IntercityBus implements Vehicle {

    public void move() {
        System.out.println(getClass().getSimpleName() + " двигается по скоростным трассам.");
    }

    public void speed() {
        System.out.println(getClass().getSimpleName() + " 100 km/h.");
    }
}
