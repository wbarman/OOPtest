package com.company;

public class TV extends Device implements Controlable {
    @Override
    public boolean turnOn() {
        if (!super.turnedOn) {
            System.out.println("TV is turning on ...");
            super.turnedOn = true;
            return true;
        }
        else {
            System.out.println("TV is already on!");
            return false;
        }
    }

    @Override
    public boolean turnOff() {
        if (super.turnedOn) {
            System.out.println("TV is turning off ...");
            super.turnedOn = true;
            return true;
        }
        else {
            System.out.println("TV is already off!");
            return false;
        }
    }

    @Override
    public String GetID() {
        return TV.class.getSimpleName();
    }
}
