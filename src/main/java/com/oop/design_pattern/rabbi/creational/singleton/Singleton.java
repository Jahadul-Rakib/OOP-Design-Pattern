package com.oop.design_pattern.rabbi.creational.singleton;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
/*
public class Singleton {
    public static Singleton firstInstance = null;

    private Singleton(){};

    public static Singleton getInstance() {
        if(firstInstance == null) {
            firstInstance = new Singleton();
        }

        return firstInstance;
    }
}*/ // This block of code is  enough to see the concepts of singleton pattern

// This is the perfect way to implement singleton pattern
public class Singleton { // Explaining thread issue with the game of scrabble
    public static Singleton firstInstance = null;

    String[] scrabbleLetters =
            {"a", "b", "c", "d", "e", "f", "g", "h",
            "i", "j", "k", "l", "m", "n", "o", "p",
            "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private LinkedList<String> letterList = new LinkedList<String>(Arrays.asList(scrabbleLetters));

    static boolean firstThread = true;
    private Singleton(){};

   // We could use "synchronized" here to handle Thread issues but it would slow down the program
    // Thats why we are using the synchronized block at the end of this method
    public static  Singleton getInstance() {
        if(firstInstance == null) {
            if (firstThread) {
                firstThread = false;

                Thread.currentThread();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            synchronized (Singleton.class) {
                if (firstInstance == null) {
                    firstInstance = new Singleton();
                    Collections.shuffle(firstInstance.letterList);
                }
            }

        }

        return firstInstance;
    }

    public LinkedList<String> getLetterList() {
        return firstInstance.letterList;
    }

    public LinkedList<String> getTiles(int howManyTiles) {
        LinkedList<String> tilesToSend = new LinkedList<String>();
        for (int i = 0; i <= howManyTiles; i++){
            tilesToSend.add(firstInstance.letterList.remove(0));
        }

        return tilesToSend;
    }
}