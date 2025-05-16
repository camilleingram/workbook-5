package com.pluralsight;

import java.time.LocalDateTime;

public class Vehicle extends Asset{

    private String makeModel = "";
    private int year = 0;
    private int odometer = 0;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        double value = 0;
        int age = year - LocalDateTime.now().getYear();
        double originalCost = super.getOriginalCost();
        double depreciation = 0;
        double finalValue = 0;

        if(age >= 0 && age <= 3) {
            value = originalCost * (1 - (0.03 * age));
        } else if(age >= 4 && age <= 6) {
            value = originalCost * (1 - (0.06 * age));
        } else if (age >= 7 && age <= 10) {
            value = originalCost * (1 - (0.08 * age));
        } else {
            value = 1000;
        }

        if(odometer > 100000 && (!makeModel.contains("Honda") || !makeModel.contains("Toyota"))) {
            finalValue = value * (1 - 0.25);
        } else {
            finalValue = value;
        }


        return finalValue;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
}
