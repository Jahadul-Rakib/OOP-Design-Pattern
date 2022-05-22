package com.oop.design_pattern.creational.abstract_factory.electornics.mobile.factory;


import com.oop.design_pattern.creational.abstract_factory.electornics.mobile.impl.Iphone;
import com.oop.design_pattern.creational.abstract_factory.electornics.mobile.impl.Samsung;
import com.oop.design_pattern.creational.abstract_factory.enums.MobileTypes;

public class MobileFactory {
    public String getMobile(MobileTypes type) {
        if(type.equals(MobileTypes.IPHONE)) {
            return new Iphone().create();
        } else {
            return new Samsung().create();
        }

    }
}
