import clients.Animal;
import clients.Lion;
import clients.Owner;
import clients.Cat;
import clients.Monkey;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Lion liova = new Lion("Лёва", 45, LocalDate.of(2007, 2, 3), new Owner());
        Lion lvenok = new Lion("Львенок", 40, LocalDate.of(2007, 2, 3), new Owner());
        Cat Ivan = new Cat("Иван", 13, LocalDate.of(2011, 2, 3), new Owner());
        Monkey Monya = new Monkey("Моня", 4, LocalDate.of(2020, 2, 1), new Owner());

        System.out.println(liova);
        System.out.println(lvenok);
        System.out.println(Ivan);
        System.out.println(Monya);
        liova.lifeCycle();
        lvenok.lifeCycle();
        Ivan.lifeCycle();
        Monya.lifeCycle();

        List<Animal> animals = new ArrayList<>();
        animals.add(liova);
        animals.add(lvenok);
        animals.add(Ivan);
        animals.add(Monya);
    }
}