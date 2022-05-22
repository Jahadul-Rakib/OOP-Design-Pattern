package com.oop.design_pattern.rakib.creational.abstract_factory_pattern.truck_factory;

public interface Truck {
    void setUpEngine(String engine);

    void setUpOtherEssential(String otherIngredients);

    boolean testTruck();
}
