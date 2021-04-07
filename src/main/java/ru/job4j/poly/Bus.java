package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void go() {
        System.out.println("Go!");
    }

    @Override
    public void passengers(int passenger) {
        System.out.println("Passengers are: " + passenger);
    }

    @Override
    public int refuel(int fuel) {
       int priceByLitre = 5;
       int rsl = fuel * priceByLitre;
        return rsl;
    }
}
