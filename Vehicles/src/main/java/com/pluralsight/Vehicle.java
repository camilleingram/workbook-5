package com.pluralsight;

public class Vehicle {
    private String color;
    private int numberOfPassengers;
    private int cargoCapacity;
    private int fuelCapacity;
    private boolean hasWheels;
    private boolean onLand;
    private boolean hasDoors;

    public Vehicle(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, boolean hasWheels, boolean onLand,
            boolean hasDoors) {
        this.color = color;
        this.numberOfPassengers = numberOfPassengers;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
        this.hasWheels = hasWheels;
        this.onLand = onLand;
        this.hasDoors = hasDoors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public boolean isHasWheels() {
        return hasWheels;
    }

    public void setHasWheels(boolean hasWheels) {
        this.hasWheels = hasWheels;
    }

    public boolean isOnLand() {
        return onLand;
    }

    public void setOnLand(boolean onLand) {
        this.onLand = onLand;
    }

    public boolean isHasDoors() {
        return hasDoors;
    }

    public void setHasDoors(boolean hasDoors) {
        this.hasDoors = hasDoors;
    }

    public void start() {
        System.out.println("Vehicle started");
    }

    public void stop() {
        System.out.println("Vehicle stopped");
    }

    public void park() {
        System.out.println("Vehicle parked");
    }

    public void turn(String direction) {
        System.out.printf("Turning %s", direction);
    }

    public void accelerate(int current, int change) {
        current += change;
        System.out.printf("Speed up to %d mph", current);
    }

    public void brake(int current, int change) {
        current -= change;
        System.out.printf("Slowed down to %d mph");
    }

    public void honk() {
        System.out.println("beep beep!");
    }
}
