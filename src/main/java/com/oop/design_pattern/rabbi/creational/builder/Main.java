package com.oop.design_pattern.rabbi.creational.builder;

public class Main {
    public static void main(String[] args) {
        RobotBuilder oldStyleRobot = new OldRobotBuilder();
        RobotDirector robotDirector = new RobotDirector(oldStyleRobot);
        robotDirector.makeRobot();
        Robot testRobot = robotDirector.getRobot();
        System.out.println("Robot Built!");
        System.out.println("Robot Head type : " + testRobot.getRobotHead());
        System.out.println("Robot Torso type : " + testRobot.getRobotTorso());
        System.out.println("Robot Arms type : " + testRobot.getRobotArms());
        System.out.println("Robot Legs type : " + testRobot.getRobotLegs());
    }
}
