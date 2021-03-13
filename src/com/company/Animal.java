package com.company;
import java.io.File;

public class Animal {
    String name;
    Double weight;
    String species;
    File pic;

    void feed(){
        this.weight += 1;
        System.out.println("thx for food");
    }
}
