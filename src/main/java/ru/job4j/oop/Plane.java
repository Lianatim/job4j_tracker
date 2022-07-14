package ru.job4j.oop;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " летает в воздухе");
    }

    @Override
    public void addStuff() {
        System.out.println(getClass().getSimpleName() + " перевозит заграничные товары");
    }
}
