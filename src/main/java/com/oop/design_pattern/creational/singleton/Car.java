package com.oop.design_pattern.creational.singleton;

import java.util.Objects;

public class Car {
    private static volatile Car carInstance;
    private String model;
    private String color;

    public Car() {

    }

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public static Car getCarSingletonInstance() {
        if (Objects.nonNull (carInstance)) {
            return carInstance;
        } else {
            carInstance = new Car ();
            return carInstance;
        }

    }

}
