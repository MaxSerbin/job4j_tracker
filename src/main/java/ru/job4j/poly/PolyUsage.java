package ru.job4j.poly;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle train = new Train();
        Vehicle intercityBus = new IntercityBus();

        Vehicle[] vehicles = new Vehicle[]{plane, train, intercityBus};
        for (Vehicle i : vehicles) {
            i.move();
            i.speed();
        }
    }
}
