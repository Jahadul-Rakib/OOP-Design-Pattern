package com.oop.design_pattern.creational.fectory_method;

import com.oop.design_pattern.creational.fectory_method.factory.TruckFactory;
import com.oop.design_pattern.creational.fectory_method.factory.trucks.Truck;

public class Main {
    public static void main(String[] args) {
        TruckFactory truckFactory = new TruckFactory ();

        Truck oneToneTruck = truckFactory.createTruck ("one");
        oneToneTruck.setUpEngine ("1000HP");
        oneToneTruck.setUpOtherEssential ("COLOR-RED");
        oneToneTruck.testTruck ();

        Truck fiveToneTruck = truckFactory.createTruck ("five");
        fiveToneTruck.setUpEngine ("5000HP");
        fiveToneTruck.setUpOtherEssential ("COLOR-BLUE");
        fiveToneTruck.testTruck ();

        Truck tenToneTruck = truckFactory.createTruck ("ten");
        tenToneTruck.setUpEngine ("10000HP");
        tenToneTruck.setUpOtherEssential ("COLOR-YELLOW");
        tenToneTruck.testTruck ();
    }
}
