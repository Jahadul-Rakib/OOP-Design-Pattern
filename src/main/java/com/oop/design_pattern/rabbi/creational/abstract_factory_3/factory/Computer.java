package com.oop.design_pattern.rabbi.creational.abstract_factory_3.factory;

public interface Computer {
    public abstract String ram();
    public abstract String hdd();
    public abstract String cpu();

    public boolean isGraphicsEnabled();
    public boolean isBluetoothEnabled();
}
