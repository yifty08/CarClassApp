package com.company;

public class Car {

    private String model, make, color;
    private int year, speed;

    // no-argument default constructor
    public Car() {

    }

    // overloaded constructor
    public Car(String make, String model, int year, String color){
        this.color = color;
        this.model = model;
        this.make = make;
        this.year = year;
    }
    // one-arg constructor
    public Car(String color){
        setColor(color);
    }

    public Car(int year){
        this.year = year;
    }

    // getters and setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    // additional functions
    // methods which return a string indicating each task the car is performing.
    public String start() {
        return " is starting.";
    }

    public String accel() {
        return " is accelerating.";
    }

    public String showSpeed() {
        return " is going " + getSpeed() + " mph.";
    }

    public String stop() {
        return " is stopped.";
    }
}
