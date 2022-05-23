package com.oop.design_pattern.rabbi.creational.abstract_factory_3.factory;

import com.oop.design_pattern.rabbi.creational.abstract_factory_3.impl.Laptop;

public class LaptopFactory implements AbstractComputerFactory{
    private String ram;
    private String hdd;
    private String cpu;
    private boolean isGraphicsEnabled;
    private boolean isBluetoothEnabled;

    public LaptopFactory(String ram, String hdd, String cpu, boolean isGraphicsEnabled, boolean isBluetoothEnabled) {
        super();
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
        this.isGraphicsEnabled = isGraphicsEnabled;
        this.isBluetoothEnabled = isBluetoothEnabled;
    }

    @Override
    public Computer createComputer() {
        return new Laptop(ram, hdd, cpu, isGraphicsEnabled, isBluetoothEnabled);
    }
}
