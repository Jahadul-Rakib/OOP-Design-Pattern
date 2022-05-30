package com.oop.design_pattern.rabbi.creational.prototype;


public class Main {
    public static void main(String[] args) {
        CloneFactory animalMaker = new CloneFactory();
        Sheep sally = new Sheep();
        Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);
        System.out.println(sally);
        System.out.println( "Hash : "+ System.identityHashCode(System.identityHashCode(sally)));
        System.out.println(clonedSheep);
        System.out.println( "Hash : "+ System.identityHashCode(System.identityHashCode(clonedSheep)));
    }
}
