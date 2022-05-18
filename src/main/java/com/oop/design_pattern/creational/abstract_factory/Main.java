package com.oop.design_pattern.creational.abstract_factory;
import com.oop.design_pattern.creational.abstract_factory.electornics.laptop.factory.LaptopFactory;
import com.oop.design_pattern.creational.abstract_factory.electornics.mobile.factory.MobileFactory;
import com.oop.design_pattern.creational.abstract_factory.enums.ElectronicsType;
import com.oop.design_pattern.creational.abstract_factory.enums.LaptopTypes;
import com.oop.design_pattern.creational.abstract_factory.enums.MobileTypes;
import com.oop.design_pattern.creational.abstract_factory.factory.ElectronicsFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Abstract Factory Pattern!");
        ElectronicsFactory electronicsFactory =  new ElectronicsFactory();
        MobileFactory mobileFactory = (MobileFactory) electronicsFactory.getElectornics(ElectronicsType.MOBILE);
        System.out.println(mobileFactory.getMobile(MobileTypes.SAMSUNG));
        LaptopFactory laptopFactory = (LaptopFactory) electronicsFactory.getElectornics(ElectronicsType.LAPTOP);
        System.out.println(laptopFactory.getLaptop(LaptopTypes.MACBOOK));
    }
}
