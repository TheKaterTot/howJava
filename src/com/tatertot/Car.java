package com.tatertot;

public abstract class Car {
    protected String type;

    public Car(String type) {
       this.type = type;
    }

    public abstract String getInfo();

    public String getType() {
        return type;
    }
}
