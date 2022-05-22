package com.oop.design_pattern.rakib.creational.abstract_factory_pattern.example_one.factory.bus_fectory.buses;

import com.oop.design_pattern.rakib.creational.abstract_factory_pattern.example_one.factory.Car;

public class SixtySitBus implements Car {
    private String engine;
    private String otherIngredients;

    @Override
    public void setUpEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void setUpOtherEssential(String otherIngredients) {
        this.otherIngredients = otherIngredients;
    }

    @Override
    public void drive() {
        System.out.println ("Engine: " + this.engine);
        System.out.println ("OtherIngredients: " + this.otherIngredients);
        System.out.println ("Truck Test Successful");
        System.out.println ("driving the Bus 60 passengers Bho....Bho.....");
    }
}
