package com.company;

public class RemoteControl {

    private static Controlable connectedControlableDevice;

    private static class RemoteControlHolder {
        public static RemoteControl instance = new RemoteControl();
    }

    public static RemoteControl getInstance() {
        return RemoteControlHolder.instance;
    }

    private RemoteControl(){
    }

    public boolean connectControlableDevice(Controlable controlableDevice) {
        connectedControlableDevice = controlableDevice;
        System.out.println("Device connected: " + controlableDevice.GetID());
        return true;
    }

    public boolean turnDeviceOn() {
        return connectedControlableDevice.turnOn();
    }

    public boolean turnDeviceOff() {
        return connectedControlableDevice.turnOff();
    }


}
