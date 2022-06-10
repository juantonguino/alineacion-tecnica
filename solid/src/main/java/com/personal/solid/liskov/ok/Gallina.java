package com.personal.solid.liskov.ok;

public class Gallina implements IAveNoVoladora {
    @Override
    public String caminar() {
        return "La Gallina Camina";
    }

    @Override
    public String comer() {
        return "La Gallina Come";
    }
}
