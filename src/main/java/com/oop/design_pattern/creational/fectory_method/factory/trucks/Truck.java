package com.oop.design_pattern.creational.fectory_method.factory.trucks;

public interface Truck {
    void setUpEngine(String engine);

    void setUpOtherEssential(String otherIngredients);

    boolean testTruck();
}
