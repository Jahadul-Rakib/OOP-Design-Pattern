package com.oop.design_pattern.rakib.creational.prototype.classes;

import com.oop.design_pattern.rakib.creational.prototype.Car;

public class BMW implements Car {
    private String carModel;
    private String carEng;
    private Long carPrice;

    public BMW() {
    }

    public BMW(String carModel, String carEng, Long carPrice) {
        this.carModel = carModel;
        this.carEng = carEng;
        this.carPrice = carPrice;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarEng() {
        return carEng;
    }

    public void setCarEng(String carEng) {
        this.carEng = carEng;
    }

    public Long getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(Long carPrice) {
        this.carPrice = carPrice;
    }

    @Override
    public String toString() {
        return "BMW{" +
                "carModel='" + carModel + '\'' +
                ", carEng='" + carEng + '\'' +
                ", carPrice=" + carPrice +
                '}';
    }

    @Override
    public Car clone() {
        return new BMW (carModel, carEng, carPrice);
    }
}
