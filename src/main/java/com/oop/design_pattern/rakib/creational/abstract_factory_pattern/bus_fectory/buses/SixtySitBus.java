package com.oop.design_pattern.rakib.creational.abstract_factory_pattern.bus_fectory.buses;

import com.oop.design_pattern.rakib.creational.abstract_factory_pattern.bus_fectory.Bus;

public class SixtySitBus implements Bus {
    private String engine;
    private String otherIngredients;
    private Integer totalSit;

    @Override
    public void setUpEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void setUpSet(Integer totalSeat) {
        this.totalSit = totalSeat;
    }

    @Override
    public void setUpOtherEssential(String otherIngredients) {
        this.otherIngredients = otherIngredients;
    }

    @Override
    public boolean testTruck() {
        System.out.println ("Engine: " + this.engine);
        System.out.println ("Total Sit: " + this.totalSit);
        System.out.println ("OtherIngredients: " + this.otherIngredients);
        System.out.println ("Truck Test Successful");
        return true;
    }
}
