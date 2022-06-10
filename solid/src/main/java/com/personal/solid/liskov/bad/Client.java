package com.personal.solid.liskov.bad;

import java.util.Arrays;

public class Client {

    public static void main(String[] args) {
        IAve lola= new Gallina();
        System.out.println(lola.caminar());
        System.out.println(lola.comer());
        try{
            System.out.println(lola.volar());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
