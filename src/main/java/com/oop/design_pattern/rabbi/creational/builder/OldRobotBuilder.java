package com.oop.design_pattern.rabbi.creational.builder;

public class OldRobotBuilder implements RobotBuilder{

    private Robot robot;

    public OldRobotBuilder() {
        this.robot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Tin Head");
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("Tin Torso");
    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("Metal Arms");
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("Metal Legs");
    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }
}
