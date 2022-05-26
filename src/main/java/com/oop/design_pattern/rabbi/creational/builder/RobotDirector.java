package com.oop.design_pattern.rabbi.creational.builder;

public class RobotDirector { // Derek banas loves to call it "RobotEngineer"
    private RobotBuilder robotBuilder;

    public RobotDirector(RobotBuilder robotBuilder) {
        this.robotBuilder = robotBuilder;
    }


    public void makeRobot() {
        this.robotBuilder.buildRobotHead();
        this.robotBuilder.buildRobotTorso();
        this.robotBuilder.buildRobotArms();
        this.robotBuilder.buildRobotLegs();
    }

    public Robot getRobot() {
        return this.robotBuilder.getRobot();
    }
}
