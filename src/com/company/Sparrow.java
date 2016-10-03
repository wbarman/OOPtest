package com.company;

public class Sparrow extends Bird  implements Flyable {
    public Sparrow(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void fly() {
        System.out.println("Flying ...");
    }
}
