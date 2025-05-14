package com.pluralsight;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        House myHouse = new House("Apartment", "01/30/2025", 1800, "1234 IBM Drive", 2, 756, 0 );
        House momHouse = new House("Single-Family", "01/01/2003", 300000, "1234 Nene Goose", 1, 3000, 1 );
        Vehicle myCar = new Vehicle("SUV", "06/18/2018", 20000, "Honda CRV", 2018, 63000);
        Vehicle dadCar = new Vehicle("Sports car", "06/18/2006", 50000, "Dodge Charger", 2006, 200000);

        assets.add(myHouse);
        assets.add(momHouse);
        assets.add(myCar);
        assets.add(dadCar);

        for(Asset asset : assets) {
            System.out.printf("%s | %s | $%.2f | $%.2f%n", asset.getDescription(), asset.getDateAcquired(),
                              asset.getOriginalCost(),
                              asset.getValue());
        }
    }
}