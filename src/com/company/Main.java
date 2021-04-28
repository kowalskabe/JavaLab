package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("Chihuahua");
        dog.name = "Gremlin";

        Animal cat = new Animal("Devon rex");
        cat.name = "Bella";

        dog.feed();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.feed();


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
