package com.oop.design_pattern.creational.fectory_method.factory.trucks;

public class OneTonTruck implements Truck {
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
    public boolean testTruck() {
        System.out.println ("from : oneTon Category");
        System.out.println ("Engine: " + this.engine);
        System.out.println ("OtherIngredients: " + this.otherIngredients);
        System.out.println ("Truck Test Successful");
        System.out.println ("\n\n\n");
        return true;
    }

}
