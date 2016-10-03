package com.company;

public class Bird extends Animal {

    public Bird(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void move() {
        System.out.println("Flapping wings ...");
    }
}
