package com.oop.design_pattern.rabbi.creational.abstract_factory.factory;
import com.oop.design_pattern.rabbi.creational.abstract_factory.electornics.laptop.factory.LaptopFactory;
import com.oop.design_pattern.rabbi.creational.abstract_factory.electornics.mobile.factory.MobileFactory;
import com.oop.design_pattern.rabbi.creational.abstract_factory.enums.ElectronicsType;

public class ElectronicsFactory<T> {
    public T getElectornics(ElectronicsType type){
        if(type.equals(ElectronicsType.LAPTOP)){
            return (T) new LaptopFactory();
        } else if (type.equals(ElectronicsType.MOBILE)) {
            return (T) new MobileFactory();
        } else {
            return null;
        }
    }
}
