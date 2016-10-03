package com.company;

public class Projector extends Device implements Controlable {
    @Override
    public boolean turnOn() {
        if (!super.turnedOn) {
            System.out.println("Projector is turning on ...");
            super.turnedOn = true;
            return true;
        }
        else {
            System.out.println("Projector is already on!");
            return false;
        }
    }

    @Override
    public boolean turnOff() {
        if (super.turnedOn) {
            System.out.println("Projector is turning off ...");
            super.turnedOn = true;
            return true;
        }
        else {
            System.out.println("Projector is already off!");
            return false;
        }
    }

    @Override
    public String GetID() {
        return Projector.class.getSimpleName();
    }
}
