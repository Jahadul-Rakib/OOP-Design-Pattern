package com.oop.design_pattern.rabbi.creational.singleton;
import java.util.LinkedList;

public class ScrabbledTest {
    public static void main(String[] args) {
        Singleton newInstance = Singleton.getInstance();
        System.out.println("Instance ID : " + System.identityHashCode(newInstance));
        System.out.println(newInstance.getLetterList());
        LinkedList<String> playerOnetiles = newInstance.getTiles(7);
        System.out.println("Player 1 : " + playerOnetiles);
        System.out.println(newInstance.getLetterList());

        Singleton newInstance2 = Singleton.getInstance();
        System.out.println("Instance 2 ID : " + System.identityHashCode(newInstance2));
        System.out.println(newInstance2.getLetterList());
        LinkedList<String> playerTwoTiles = newInstance2.getTiles(7);
        System.out.println("Player 2 : " + playerTwoTiles);
        System.out.println(newInstance2.getLetterList());
    }
}
