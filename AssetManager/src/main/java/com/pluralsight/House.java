package com.pluralsight;

public class House extends Asset{

    private String address = "";
    private int condition = 0;
    private int squareFoot = 0;
    private int lotSize = 0;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot,
            int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    @Override
    public double getValue() {
        double value = 0;
        switch(condition) {
            case 1:
                value = (squareFoot * 180) + 0.25 * lotSize;
                break;
            case 2:
                value = (squareFoot * 130) + 0.25 * lotSize;
                break;
            case 3:
                value = (squareFoot * 90) + 0.25 * lotSize;
                break;
            case 4:
                value = (squareFoot * 80) + 0.25 * lotSize;
                break;
        }
        return value;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
}
