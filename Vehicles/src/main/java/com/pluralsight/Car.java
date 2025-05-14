package com.pluralsight;

public class Car extends Vehicles{
    private int numberOfDoors;

    public boolean useTrunk(boolean trunk)  {
        return !trunk;
    }

    public boolean rollWindow(boolean window) {
        return !window;
    }
}
