package com.pluralsight;

public class SemiTruck extends Vehicle {
    private int numberOfWheels;
    private double trailerLength;
    private boolean hasTrailer;

    public SemiTruck(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, boolean hasWheels, boolean onLand,
            boolean hasDoors, int numberOfWheels, double trailerLength, boolean hasTrailer) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, hasWheels, onLand, hasDoors);
        this.numberOfWheels = numberOfWheels;
        this.trailerLength = trailerLength;
        this.hasTrailer = hasTrailer;
    }

    public void attachTrailer() {
        System.out.println("Trailer now connected");
    }
}
