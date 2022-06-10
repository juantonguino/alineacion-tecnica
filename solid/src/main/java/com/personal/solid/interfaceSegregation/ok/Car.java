package com.personal.solid.interfaceSegregation.ok;

public class Car implements  IElectronicSystem, IEngineControl, IMultimediaControl{
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

    @Override
    public void playAudio() {
        System.out.println("Inicio lista reproduccion");
    }

    @Override
    public void upVolume() {
        System.out.println("Volumen arriba");
    }

    @Override
    public void downVolume() {
        System.out.println("Volumen abajo");
    }
}
