package com.personal.solid.dependencyInversion.ok;

import com.personal.solid.dependencyInversion.CreditCard;
import com.personal.solid.dependencyInversion.Database;
import com.personal.solid.dependencyInversion.Persistence;

public class Client {

    private static Persistence database;

    private static CreditCard creditCard;

    public static void main(String[] args) {
        database = new Database();
        creditCard = new CreditCard();

        database.save("Cafetera");
        creditCard.pay("Maestro");
    }
}
