package com.oop.design_pattern.rakib.creational.builder.example_two;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder ()
                .HDD ("1TB")
                .RAM ("32GB")
                .screenSize ("1240px")
                .build ();
        System.out.println (computer.toString ());
    }
}
