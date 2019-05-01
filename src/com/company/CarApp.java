package com.company;

public class CarApp {

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setMake("Porsche");
        c1.setColor("red");
        System.out.println("The " + c1.getColor()
                + " " + c1.getMake()
                + c1.start());

        Car c2 = new Car("red");
        c2.setMake("Porsche");
        System.out.println("The " + c2.getColor()
                + " " + c2.getMake()
                + c2.accel());

        Car c3 = new Car("Porsche", "911", 2019, "red");
        c3.setSpeed(50);
        System.out.println("The " + c3.getColor()
                + " " + c3.getMake()
                + c3.showSpeed());

        System.out.println("The " + c2.getColor()
                + " " + c2.getMake()
                + c2.stop());
    }

}
