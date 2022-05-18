package com.oop.design_pattern.creational.abstract_factory.electornics.mobile.impl;

import com.oop.design_pattern.creational.abstract_factory.electornics.mobile.Mobile;

public class Iphone implements Mobile {
    @Override
    public String create() {
        return "This is iphone!";
    }
}
