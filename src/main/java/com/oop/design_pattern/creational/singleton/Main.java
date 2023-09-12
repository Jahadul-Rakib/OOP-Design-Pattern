package com.oop.design_pattern.creational.singleton;

public class Main {
    public static void main(String[] args) {
        Car car = Car.getCarSingletonInstance ();
        System.out.println (car.toString ());
        car.setColor ("RED");
        car.setModel ("BMW");
        System.out.println (car);
        car.setColor ("GREEN");
        System.out.println (car);

        Car car1 = Car.getCarSingletonInstance ();
        System.out.println (car1);

        Car car2 = Car.getCarSingletonInstance ();
        System.out.println (car2);

    }
}
