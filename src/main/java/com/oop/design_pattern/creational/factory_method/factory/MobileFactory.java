package com.oop.design_pattern.creational.factory_method.factory;

import com.oop.design_pattern.creational.factory_method.enums.MobileTypes;
import com.oop.design_pattern.creational.factory_method.mobile_impl.Iphone;
import com.oop.design_pattern.creational.factory_method.mobile_impl.Samsung;
import com.oop.design_pattern.creational.factory_method.mobile_impl.Sony;

public class MobileFactory {
    public String getMobile(MobileTypes type) {
        Mobile mb;
        if(type.equals(MobileTypes.SAMSUNG)) {
            mb = new Samsung();
        } else if(type.equals(MobileTypes.SONY)) {
            mb = new Sony();
        } else {
            mb = new Iphone();
        }
        return mb.createMobile ();
    }
}
