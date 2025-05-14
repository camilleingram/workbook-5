package com.pluralsight;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, boolean hasWheels, boolean onLand,
            boolean hasDoors, int numberOfDoors) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, hasWheels, onLand, hasDoors);
        this.numberOfDoors = numberOfDoors;
    }

    public boolean useTrunk(boolean trunk)  {
        return !trunk;
    }

    public boolean rollWindow(boolean window) {
        return !window;
    }
}
