package com.pluralsight;

public class Moped extends Vehicles{
    private boolean hasPassengerSeat;

    public boolean useKickstand(boolean kickstand){
        return !kickstand;
    }

}
