package com.oop.design_pattern.rabbi.creational.factory_method.mobile.impl;

import com.oop.design_pattern.rabbi.creational.factory_method.mobile.Mobile;

public class Iphone implements Mobile {
    @Override
    public String createMobile() {
        return "This Is From Iphone";
    }
}
