package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void move() {
        System.out.println("Начало движения");
    }

    @Override
    public void passengers(int people) {
        System.out.println("Количество пассажиров: " + people);
    }

    @Override
    public int insert(int fuel) {
        return 25;
    }
}
