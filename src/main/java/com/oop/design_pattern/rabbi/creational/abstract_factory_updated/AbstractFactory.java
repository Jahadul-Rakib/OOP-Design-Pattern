package com.oop.design_pattern.rabbi.creational.abstract_factory_updated;

public interface AbstractFactory<T> {
    T create(String type);
}
