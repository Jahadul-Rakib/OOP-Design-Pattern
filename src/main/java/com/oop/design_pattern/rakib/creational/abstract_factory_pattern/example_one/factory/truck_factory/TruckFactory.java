package com.oop.design_pattern.rakib.creational.abstract_factory_pattern.example_one.factory.truck_factory;

import com.oop.design_pattern.rakib.creational.abstract_factory_pattern.example_one.factory.Car;
import com.oop.design_pattern.rakib.creational.abstract_factory_pattern.example_one.factory.truck_factory.trucks.FiveTonTruck;
import com.oop.design_pattern.rakib.creational.abstract_factory_pattern.example_one.factory.truck_factory.trucks.OneTonTruck;
import com.oop.design_pattern.rakib.creational.abstract_factory_pattern.example_one.all_enum.CarType;
import com.oop.design_pattern.rakib.creational.abstract_factory_pattern.example_one.FactoryInstance;
import com.oop.design_pattern.rakib.creational.abstract_factory_pattern.example_one.factory.truck_factory.trucks.TenTonTruck;

public class TruckFactory extends FactoryInstance {
    @Override
    public Car getInstance(CarType instanceType) {
        return switch (instanceType) {
            case TRUCK_1 -> new OneTonTruck ();
            case TRUCK_5 -> new FiveTonTruck ();
            case TRUCK_10 -> new TenTonTruck ();
            default -> null;
        };
    }
}
