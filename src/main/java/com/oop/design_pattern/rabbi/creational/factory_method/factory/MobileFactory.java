package com.oop.design_pattern.rabbi.creational.factory_method.factory;

import com.oop.design_pattern.rabbi.creational.factory_method.enums.MobileTypes;
import com.oop.design_pattern.rabbi.creational.factory_method.mobile.impl.Iphone;
import com.oop.design_pattern.rabbi.creational.factory_method.mobile.Mobile;
import com.oop.design_pattern.rabbi.creational.factory_method.mobile.impl.Samsung;
import com.oop.design_pattern.rabbi.creational.factory_method.mobile.impl.Sony;

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
