package com.oop.design_pattern.rabbi.creational.singleton;
import java.util.LinkedList;

public class GetTheTiles implements Runnable {
    @Override
    public void run() {
        Singleton newInstance = Singleton.getInstance();
        System.out.println("Instance ID : " + System.identityHashCode(newInstance));
        System.out.println(newInstance.getLetterList());
        LinkedList<String> playerOnetiles = newInstance.getTiles(7);
        System.out.println("Player 1 : " + playerOnetiles);
        System.out.println("Got Tiles");

    }

}
