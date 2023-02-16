package com.epam.OOP;

public class Animal {
    private final String color;
    private final int numberOfPaws;
    private final boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String result = "This animal is mostly " + color + ". It has " + numberOfPaws;
        if (numberOfPaws > 1) result = result.concat(" paws and ");
        else result = result.concat(" paw and ");
        if (hasFur) result = result.concat("a fur.");
        else result = result.concat("no fur.");
        return result;
    }

}
