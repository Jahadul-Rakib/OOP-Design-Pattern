package com.oop.design_pattern.rakib.creational.abstract_factory_pattern.bus_fectory;

public interface Bus {
    void setUpEngine(String engine);

    void setUpSet(Integer totalSeat);

    void setUpOtherEssential(String otherIngredients);

    boolean testTruck();
}
