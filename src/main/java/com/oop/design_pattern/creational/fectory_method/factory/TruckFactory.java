package com.oop.design_pattern.creational.fectory_method.factory;

import com.oop.design_pattern.creational.fectory_method.factory.trucks.Truck;
import com.oop.design_pattern.creational.fectory_method.factory.trucks.FiveTonTruck;
import com.oop.design_pattern.creational.fectory_method.factory.trucks.OneTonTruck;
import com.oop.design_pattern.creational.fectory_method.factory.trucks.TenTonTruck;

public class TruckFactory {
    public Truck createTruck(String truckTon) {
        switch (truckTon) {
            case "one":
                return new OneTonTruck ();
            case "five":
                return new FiveTonTruck ();
            case "ten":
                return new TenTonTruck ();
            default:
                return null;
        }
    }
}
