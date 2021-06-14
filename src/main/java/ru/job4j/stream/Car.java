package ru.job4j.stream;

public class Car {
    private String model;
    private int year;
    private String color;
    private int hp;
    private int speed;
    private String number;

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", hp=" + hp +
                ", speed=" + speed +
                ", number='" + number + '\'' +
                '}';
    }

    static class Builder {
        private String model;
        private int year;
        private String color;
        private int hp;
        private int speed;
        private String number;

        Builder buildModel(String model) {
            this.model = model;
            return this;
        }
        Builder buildYear(int year) {
            this.year = year;
            return this;
        }
        Builder buildColor(String color) {
            this.color = color;
            return this;
        }
        Builder buildHp(int hp) {
            this.hp = hp;
            return this;
        }
        Builder buildSpeed(int speed) {
            this.speed = speed;
            return this;
        }
        Builder buildNumber(String number) {
            this.number = number;
            return this;
        }

        Car build() {
            Car car = new Car();
            car.model = model;
            car.year = year;
            car.color = color;
            car.hp = hp;
            car.speed = speed;
            car.number = number;
            return car;
        }
    }

    public static void main(String[] args) {
        Car car = new Builder()
                .buildModel("Mustang")
                .buildYear(1967)
                .buildColor("Red")
                .buildHp(420)
                .buildSpeed(250)
                .buildNumber("a777aa77")
                .build();
        System.out.println(car);
    }
}
