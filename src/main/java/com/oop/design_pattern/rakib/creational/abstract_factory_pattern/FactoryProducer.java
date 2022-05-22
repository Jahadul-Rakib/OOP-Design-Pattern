package com.oop.design_pattern.rakib.creational.abstract_factory_pattern;

import com.oop.design_pattern.rakib.creational.abstract_factory_pattern.all_enum.FactoryType;
import com.oop.design_pattern.rakib.creational.abstract_factory_pattern.factory.bus_fectory.BusFactory;
import com.oop.design_pattern.rakib.creational.abstract_factory_pattern.factory.truck_factory.TruckFactory;

public class FactoryProducer {
    public static FactoryInstance getFactory(FactoryType carType) {
        return switch (carType) {
            case BUS -> new BusFactory ();
            case TRUCK -> new TruckFactory ();
            default -> null;
        };
    }
}
