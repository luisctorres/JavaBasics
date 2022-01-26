package com.careerdevs.objectfactory;

public class FruitFactory {
    //Fields: name (String), color (String), hasSeeds (boolean)
    public String name;
    public String color;
    public Boolean hasSeeds;


    //constructor
    FruitFactory(String name, String color, Boolean hasSeeds) {
        this.name = name;
        this.color = color;
        this.hasSeeds = hasSeeds;
    }

}
