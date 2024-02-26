package clients;

import java.time.LocalDate;

public class Monkey extends Animal {
    public Monkey(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    protected void fly(){
        System.out.println(getType() + " cannot fly");
    }
}
