package com.oop.design_pattern.rakib.creational.prototype;

import com.oop.design_pattern.rakib.creational.prototype.classes.BMW;
import com.oop.design_pattern.rakib.creational.prototype.classes.ODDI;

public class Main {
    public static void main(String[] args) {
        BMW bmw = new BMW ("A3", "HEAVY", 12L);
        Car clone = bmw.clone ();
        System.out.println (clone);

        ODDI oddi = new ODDI ("O3", "SUPER_HEAVY", 22L);
        ODDI clone2 = (ODDI) oddi.clone ();
        System.out.println (clone2);
    }
}
