package com.personal.solid.dependencyInversion;

public class Database implements Persistence {
    @Override
    public void save(String product) {
        System.out.println("Pago Almacenado "+product);
    }
}
