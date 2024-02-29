package clients.impl;

import clients.Animal;
import clients.Owner;
import clients.Runnable;

import java.time.LocalDate;

public class Cat extends Animal implements Runnable {

    public Cat(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("Cat eats");
    }

    protected void toGo(String destination) {
        System.out.println(getType() + " is going " + destination);
    }

    protected void swim() {
        System.out.println("Cat cannot swim.");
    }

    @Override
    public double run() {
        System.out.println(this.getName() + " is running");
        return 12;
    }

    public void addPatient(Animal animal) {
    }
}

