package com.oop.design_pattern.creational.abstract_factory.electornics.laptop.factory;
import com.oop.design_pattern.creational.abstract_factory.electornics.laptop.impl.Asus;
import com.oop.design_pattern.creational.abstract_factory.electornics.laptop.impl.MacBook;
import com.oop.design_pattern.creational.abstract_factory.enums.LaptopTypes;

public class LaptopFactory {
    public String getLaptop(LaptopTypes type) {
        if(type.equals(LaptopTypes.ASUS)) {
            return  new Asus().create();
        } else {
            return  new MacBook().create();
        }
    }
}
