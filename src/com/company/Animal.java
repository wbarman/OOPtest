package com.company;



public abstract class Animal {
    String name;
    double weight;
    int age;

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public void getInfo() {
        System.out.println(this.name + " weighs " + this.weight);
    }

    public void eat() {
        System.out.println("Eating ...");
    }

    public void sleep() {
        System.out.println("Sleeping ...");
    }

    public abstract void move();
}
