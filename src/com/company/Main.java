package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // declaración de objeto Perro
        Perro lomito1 = new Perro();
        lomito1.name = "Chems";
        lomito1.age = 2;
        lomito1.race = "mestizo";
        lomito1.tall = "Wrande";
        lomito1.features();
        lomito1.eat();

        System.out.println("\n Nuevo perro");

        Perro lomito2 = new Perro();
        lomito2.name = "Chilaquil";
        lomito2.age = 3;
        lomito2.race = "Pitbull";
        lomito2.tall = "TaChiquito";
        lomito2.features();
        lomito2.sleep();
    }
}
