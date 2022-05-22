package com.oop.design_pattern.rakib.creational.abstract_factory_pattern.example_two;

public interface AbstractFactory<T> {
    T create(String typeOfObject);
}
