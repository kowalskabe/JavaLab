package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.name = "Gremlin";
        dog.species = "Chihuahua";
        dog.weight = 5.0;

        Animal cat = new Animal();
        cat.name = "Bella";
        cat.species = "Devon rex";
        cat.weight = 2.0;

        System.out.println("dog name: " + dog.name);
        System.out.println("dog weight: " + dog.weight +"kg");

        Phone iphone = new Phone();
        iphone.producer = "apple";
        iphone.model = "6S";

        Phone s11 = new Phone();
        s11.producer = "Samsung";
        s11.model = "S11";

        Human me = new Human();
        me.firstName = "Barbara";
        me.lastName = "Kowalska";
        me.gender = "female";
        me.age = 31;
        me.mobilePhone = iphone;

        dog.feed();
        String version = iphone.getOSVersion();
        System.out.println(iphone.getOSVersion());
    }
}
