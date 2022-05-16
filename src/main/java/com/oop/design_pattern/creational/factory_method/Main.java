package com.oop.design_pattern.creational.factory_method;

import com.oop.design_pattern.creational.factory_method.enums.MobileTypes;
import com.oop.design_pattern.creational.factory_method.factory.MobileFactory;

public class Main {
    public static void main(String[] args) {
        MobileFactory mFactory = new MobileFactory();
        System.out.println(mFactory.getMobile(MobileTypes.SAMSUNG).createMobile());
        System.out.println(mFactory.getMobile(MobileTypes.SONY).createMobile());
    }
}
