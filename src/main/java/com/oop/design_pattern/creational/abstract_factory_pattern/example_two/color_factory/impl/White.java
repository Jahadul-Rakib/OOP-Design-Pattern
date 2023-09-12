package com.oop.design_pattern.creational.abstract_factory_pattern.example_two.color_factory.impl;

import com.oop.design_pattern.creational.abstract_factory_pattern.example_two.color_factory.Color;

public class White implements Color {
    @Override
    public String getColor() {
        return "White";
    }
}
