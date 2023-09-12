package com.oop.design_pattern.creational.builder.example_one;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal.AnimalBuilder ()
                .name ("Dog")
                .age (5)
                .price (1200.50)
                .build ();
        System.out.println (dog.toString ());
    }
}
