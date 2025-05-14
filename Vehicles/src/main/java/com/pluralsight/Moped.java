package com.pluralsight;

public class Moped extends Vehicle {
    private boolean hasPassengerSeat;

    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, boolean hasWheels, boolean onLand,
            boolean hasDoors, boolean hasPassengerSeat) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, hasWheels, onLand, hasDoors);
        this.hasPassengerSeat = hasPassengerSeat;
    }

    public boolean useKickstand(boolean kickstand){
        return !kickstand;
    }

}
