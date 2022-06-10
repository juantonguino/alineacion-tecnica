package com.personal.solid.interfaceSegregation.ok;

public class Client {

    public static void main(String[] args) {
        MotorCyle motorCyle= new MotorCyle();
        IElectronicSystem electronicSystem= motorCyle;
        IEngineControl engineControl= motorCyle;

        electronicSystem.turnLeftLight();
        electronicSystem.turnRightLight();
        electronicSystem.turnStopLight();

        engineControl.drive();
        engineControl.powerOff();
        engineControl.start();
    }
}
