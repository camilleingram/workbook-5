package com.pluralsight;

public class Hovercraft extends Vehicle {

    public Hovercraft(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, boolean hasWheels,
            boolean onLand,
            boolean hasDoors) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, hasWheels, onLand, hasDoors);
    }

    public void hover() {
        System.out.println("You're hovering");
    }
}
