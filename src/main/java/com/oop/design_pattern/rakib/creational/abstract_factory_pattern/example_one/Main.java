package com.oop.design_pattern.rakib.creational.abstract_factory_pattern.example_one;

import com.oop.design_pattern.rakib.creational.abstract_factory_pattern.example_one.all_enum.CarType;
import com.oop.design_pattern.rakib.creational.abstract_factory_pattern.example_one.all_enum.FactoryType;
import com.oop.design_pattern.rakib.creational.abstract_factory_pattern.example_one.factory.Car;

public class Main {
    public static void main(String[] args) {
        FactoryInstance truck = FactoryProducer.getFactory (FactoryType.TRUCK);
        Car truckInstance = truck.getInstance (CarType.TRUCK_10);
        truckInstance.setUpEngine ("1000HP");
        truckInstance.setUpOtherEssential ("RED BODY");
        truckInstance.drive ();
    }
}
