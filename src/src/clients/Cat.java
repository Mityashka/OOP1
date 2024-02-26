package clients;

import java.time.LocalDate;

public class Cat extends Animal {
    public Cat(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
        protected void swim(){
            System.out.println(getType() + " cannot swim");
        }
        protected void fly(){
            System.out.println(getType() + " cannot fly");
        }
}
