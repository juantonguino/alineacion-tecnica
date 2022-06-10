package com.personal.solid.interfaceSegregation.ok;

public class MotorCyle implements IElectronicSystem, IEngineControl{
    @Override
    public void turnRightLight() {
        System.out.println("Luces derechas encendidas");
    }

    @Override
    public void turnLeftLight() {
        System.out.println("Luces izquierdas encendidas");
    }

    @Override
    public void turnStopLight() {
        System.out.println("Luces de alto encendidas");
    }

    @Override
    public void start() {
        System.out.println("Motor encendido");
    }

    @Override
    public void drive() {
        System.out.println("Motor en Modo Drive");
    }

    @Override
    public void powerOff() {
        System.out.println("Motor apagado");
    }

}
