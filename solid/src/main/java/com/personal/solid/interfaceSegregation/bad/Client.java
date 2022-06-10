package com.personal.solid.interfaceSegregation.bad;

public class Client {

    public static void main(String[] args) {
        IVehicle car= new Car();
        car.turnRightLight();
        car.turnLeftLight();
        car.turnStopLight();
        car.start();
        car.drive();
        car.powerOff();
        car.playAudio();
        car.upVolume();
        car.downVolume();

        IVehicle moto= new MotorCyle();
        moto.turnRightLight();
        moto.turnLeftLight();
        moto.turnStopLight();
        moto.start();
        moto.drive();
        moto.powerOff();
        moto.playAudio();
        moto.upVolume();
        moto.downVolume();
    }
}
