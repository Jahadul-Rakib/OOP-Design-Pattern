package com.oop.design_pattern.creational.factory_method.mobile.impl;

import com.oop.design_pattern.creational.factory_method.mobile.Mobile;

public class Samsung implements Mobile {
    @Override
    public String createMobile() {
        return "This Is From Samsung";
    }
}
