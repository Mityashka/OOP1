package clients.impl;

import clients.Animal;
import clients.Owner;

import java.time.LocalDate;

public class Lion extends Animal {
    public Lion(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    public void addPatient(Animal animal) {
    }
    @Override
    public void eat() {
    }
    @Override
    public double run() {
        return 22;
    }
    public void addPatient(Object patient) {
    }
}
