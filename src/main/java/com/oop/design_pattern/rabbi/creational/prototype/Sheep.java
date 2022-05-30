package com.oop.design_pattern.rabbi.creational.prototype;

public class Sheep implements Animal{
    public Sheep() {
        System.out.println("Sheep is Made!");
    }

    public Animal makeCopy() {
        System.out.println("Sheep is Made!");

        Sheep sheepObject = null;
        try {
            sheepObject = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return sheepObject;
    }

    @Override
    public String toString() {
        return "Sheep is doing beep beep!";
    }
}
