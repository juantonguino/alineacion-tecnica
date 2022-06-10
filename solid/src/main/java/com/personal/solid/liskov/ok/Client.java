package com.personal.solid.liskov.ok;

public class Client {

    public static void main(String[] args) {
        IAveNoVoladora lola= new Gallina();
        System.out.println(lola.caminar());
        System.out.println(lola.comer());

        IAveVoladora damian = new Aguila();
        System.out.println(damian.volar());
        System.out.println(damian.caminar());
        System.out.println(damian.comer());
    }
}
