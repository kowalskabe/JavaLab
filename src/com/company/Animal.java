package com.company;
import java.io.File;

public class Animal {
    String name;
    private Double weight;
    final String species;
    File pic;

    public Animal(String s){
        species = s;
        switch (species) {
            case "Devon rex" -> weight = 3.0;
            case "Chihuahua" -> weight = 5.0;
            default -> weight = 0.0;
        }

    }
    void feed(){
        if (weight > 0){
            this.weight += 1;
            System.out.println("thx for food");
        }
        else {
            System.out.println("Your pet is already dead - not hungry anymore");
        }
    }

    void takeForWalk() {
        if (weight > 0) {
            this.weight -= 1;
            if (weight <= 0) {
                System.out.println("Your pet died");
            }
        } else {
            System.out.println("Your pet is already dead - walking with him could be a bad idea");
        }
    }
}
