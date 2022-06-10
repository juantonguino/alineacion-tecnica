package com.personal.solid.liskov.ok;

public class Aguila implements IAveVoladora{

    @Override
    public String caminar() {
        return "El Aguila Camina";
    }

    @Override
    public String volar() {
        return "El Aguila Vuela";
    }

    @Override
    public String comer() {
        return "El Aguila Come";
    }
}
