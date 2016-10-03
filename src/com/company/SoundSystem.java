package com.company;

public class SoundSystem extends Device implements Controlable {
    @Override
    public boolean turnOn() {
        if (!super.turnedOn) {
            System.out.println("Sound system is turning on ...");
            super.turnedOn = true;
            return true;
        }
        else {
            System.out.println("Sound system is already on!");
            return false;
        }
    }

    @Override
    public boolean turnOff() {
        if (super.turnedOn) {
            System.out.println("Sound system is turning off ...");
            super.turnedOn = true;
            return true;
        }
        else {
            System.out.println("sound system is already off!");
            return false;
        }
    }

    @Override
    public String GetID() {
        return SoundSystem.class.getSimpleName();
    }
}
