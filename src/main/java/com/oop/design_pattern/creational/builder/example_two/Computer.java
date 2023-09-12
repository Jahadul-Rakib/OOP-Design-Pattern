package com.oop.design_pattern.creational.builder.example_two;

public class Computer {
    private String HDD;
    private String RAM;
    private String screenSize;

    public Computer(String hdd, String ram, String screenSize) {
        HDD = hdd;
        RAM = ram;
        this.screenSize = screenSize;
    }

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setHDD(String HDD) {
        this.HDD = HDD;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "HDD='" + HDD + '\'' +
                ", RAM='" + RAM + '\'' +
                ", screenSize='" + screenSize + '\'' +
                '}';
    }

    public static class ComputerBuilder {
        private String HDD;
        private String RAM;
        private String screenSize;
        public ComputerBuilder() {

        }

        public ComputerBuilder HDD(String HDD) {
            this.HDD = HDD;
            return this;
        }

        public ComputerBuilder RAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public ComputerBuilder screenSize(String screenSize) {
            this.screenSize = screenSize;
            return this;
        }

        public Computer build() {
            return new Computer (this.HDD, this.RAM, this.screenSize);
        }
    }
}
