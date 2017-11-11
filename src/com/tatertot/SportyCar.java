package com.tatertot;

public class SportyCar extends Car {

    public SportyCar() {
        super("Sporty");
    }

    @Override
    public String getInfo() {
        return "Vroom vroom " + getType();
    }
}
