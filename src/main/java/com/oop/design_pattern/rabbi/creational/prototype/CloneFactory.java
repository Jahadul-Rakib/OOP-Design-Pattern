package com.oop.design_pattern.rabbi.creational.prototype;

public class CloneFactory {
    public Animal getClone(Animal animalSample){
        return animalSample.makeCopy();
    }
}
