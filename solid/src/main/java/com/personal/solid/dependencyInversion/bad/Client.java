package com.personal.solid.dependencyInversion.bad;

import com.personal.solid.dependencyInversion.CreditCard;
import com.personal.solid.dependencyInversion.Database;

public class Client {

    public static void main(String[] args) {
        Database database= new Database();
        database.save("Cafetera");
        CreditCard creditCard = new CreditCard();
        creditCard.pay("Maestro");
    }
}
