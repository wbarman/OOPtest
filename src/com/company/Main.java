package com.company;

public class Main {

    public static void main(String[] args) {
	    Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();
        TV tv = new TV();

        RemoteControl ovladac = RemoteControl.getInstance();

        ovladac.connectControlableDevice(projector);
        ovladac.turnDeviceOff();
        ovladac.turnDeviceOn();

        ovladac.connectControlableDevice(tv);
        ovladac.turnDeviceOff();
        ovladac.turnDeviceOn();
        ovladac.turnDeviceOff();



    }
}
