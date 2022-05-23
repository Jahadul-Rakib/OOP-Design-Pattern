package com.oop.design_pattern.rabbi.creational.abstract_factory_3.impl;

import com.oop.design_pattern.rabbi.creational.abstract_factory_3.factory.Computer;

public class Server implements Computer {

    private String ram;
    private String hdd;
    private String cpu;
    private boolean isGraphicsEnabled;
    private boolean isBluetoothEnabled;

    public Server(String ram, String hdd, String cpu, boolean isGraphicsEnabled, boolean isBluetoothEnabled) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
        this.isGraphicsEnabled = isGraphicsEnabled;
        this.isBluetoothEnabled = isBluetoothEnabled;
    }

    @Override
    public String ram() {
        return null;
    }

    @Override
    public String hdd() {
        return null;
    }

    @Override
    public String cpu() {
        return null;
    }

    @Override
    public boolean isGraphicsEnabled() {
        return false;
    }

    @Override
    public boolean isBluetoothEnabled() {
        return false;
    }
    @Override
    public String toString() {
        return "Server{" +
                "ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                ", cpu='" + cpu + '\'' +
                ", isGraphicsEnabled=" + isGraphicsEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }
}
