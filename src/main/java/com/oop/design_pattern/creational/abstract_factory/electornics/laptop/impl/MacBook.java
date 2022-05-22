package com.oop.design_pattern.creational.abstract_factory.electornics.laptop.impl;

import com.oop.design_pattern.creational.abstract_factory.electornics.laptop.Laptop;

public class MacBook implements Laptop {
    @Override
    public String create() {
        return "This is Macbook!";
    }
}
