package com.personal.solid.dependencyInversion;

public class CreditCard implements PaymentMethod{

    @Override
    public void pay(String card) {
        System.out.println("pago Mastercard "+ card);
    }
}
