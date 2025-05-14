package com.pluralsight;

public class SemiTruck extends Vehicles{
    private int numberOfWheels;
    private double trailerLength;
    private boolean hasTrailer;

    public void attachTrailer() {
        System.out.println("Trailer now connected");
    }
}
