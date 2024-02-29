package clients;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    private String clinicName;
    private List<Runnable> runners;
    private List<Flyable> flyers;
    private List<Swimmable> swimmers;
    private List<Object> staff;
    private List<Animal> clients;

    public VeterinaryClinic(String clinicName) {
        this.clinicName = clinicName;
        this.runners = new ArrayList<>();
        this.flyers = new ArrayList<>();
        this.swimmers = new ArrayList<>();
        this.staff = new ArrayList<>();
        this.clients = new ArrayList<>();
    }

    public void hireStaff(Object staffMember) {
        staff.add(staffMember);
    }

    public List<Runnable> getAllRunners() {
        return runners;
    }
    public List<Flyable> getAllFlyers() {
        return flyers;
    }

    public List<Swimmable> getAllSwimmers() {
        return swimmers;
    }
    public void addRunner(Runnable runner) {
        runners.add(runner);
    }

    public void addFlyer(Flyable flyer) {
        flyers.add(flyer);
    }

    public void addSwimmer(Swimmable swimmer) {
        swimmers.add(swimmer);
    }

    interface Runnable {
        double run();
    }

    public interface Flyable {
        double fly();
    }

    interface Swimmable {
        double swim();
    }
    static class Cat implements Runnable {
        @Override
        public double run() {
            return 30;
        }
    }
    static class Duck implements Flyable {
        @Override
        public double fly() {
            return 25;
        }
    }
    static class Eagle implements Flyable {
        @Override
        public double fly() {
            return 30;
        }
    }
    static class Fish implements Swimmable {
        @Override
        public double swim() {
            return 15;
        }
    }
    static class Lion implements Runnable, Swimmable {
        @Override
        public double run() {
            return 40;
        }
        @Override
        public double swim() {
            return 5;
        }
    }
    static class WaterSnake implements Swimmable {
        @Override
        public double swim() {
            return 5;
        }
    }
    public void addPatient(Animal animal) {
        clients.add(animal);
    }
    public List<Object> getAllStaff() {
        return staff;
    }
    public List<Animal> getAllClients() {
        return clients;
    }
}


