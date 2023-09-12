package com.oop.design_pattern.creational.builder.example_one;

public class Animal {
    private String name;
    private Integer age;
    private Double price;

    public Animal(String name, Integer age, Double price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }

    public static class AnimalBuilder {
        private String name;
        private Integer age;
        private Double price;

        public AnimalBuilder name(String name) {
            this.name = name;
            return this;
        }

        public AnimalBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        public AnimalBuilder price(Double price) {
            this.price = price;
            return this;
        }

        public Animal build() {
            return new Animal (this.name, this.age, this.price);
        }
    }
}
