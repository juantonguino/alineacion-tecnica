package com.personal.solid.liskov.bad;

public class Gallina implements IAve{
    @Override
    public String caminar() {
        return "La Gallina Camina";
    }

    @Override
    public String volar() throws Exception {
        throw new Exception("La Gallina no vuela");
    }

    @Override
    public String comer() {
        return "La Gallina Come";
    }
}
