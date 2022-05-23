package com.oop.design_pattern.rabbi.creational.abstract_factory_updated.color_family.impl;

import com.oop.design_pattern.rabbi.creational.abstract_factory_updated.color_family.Color;

public class White implements Color {
    @Override
    public String getColor() {
        return "This is white!";
    }
}
