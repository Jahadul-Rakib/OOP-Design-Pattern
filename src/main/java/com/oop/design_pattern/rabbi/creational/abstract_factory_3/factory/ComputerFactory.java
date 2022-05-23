package com.oop.design_pattern.rabbi.creational.abstract_factory_3.factory;

public class ComputerFactory {
    private ComputerFactory() {

    }
    public static Computer getComputer(AbstractComputerFactory abstractComputerFactory) {
        return abstractComputerFactory.createComputer();
    }
}
