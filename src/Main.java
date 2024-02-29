import clients.Animal;
import clients.VeterinaryClinic.Flyable;
import clients.Owner;
import clients.VeterinaryClinic;
import clients.impl.Cat;
import clients.impl.Duck;
import clients.impl.Eagle;
import clients.staff.Doctor;
import clients.staff.Nurse;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Doctor doc = new Doctor("Марина Петровна", LocalDate.of
                (1890, 5, 11), "surgeon", 80000);
        Nurse nurse = new Nurse("Иван Петров", LocalDate.of
                (2000, 4, 13), "anesthesiologist", 60000);
        Animal Kot = new Cat("Котяра", 5, LocalDate.of
                (1900, 2, 6), new Owner());
        Duck Ytka = new Duck("Кряк", 3, LocalDate.of(1901, 2, 3), new Owner()); // Исправление здесь
        Eagle Orel = new Eagle("Здоровяк", 4, LocalDate.of(1901, 3, 5), new Owner()); // Исправление здесь
        VeterinaryClinic clinic = new VeterinaryClinic("Petrov's Clinic");
        clinic.hireStaff(doc);
        clinic.hireStaff(nurse);
        clinic.addPatient(Kot);
        clinic.addPatient(Ytka);
        clinic.addPatient(Orel);
        Animal.addAnimal(Ytka);
        System.out.println(doc);
        System.out.println(nurse);
        System.out.println(Kot);
        System.out.println(Ytka);
        System.out.println(Orel);
        List<Flyable> flyers = clinic.getAllFlyers();
        System.out.println("All flyers:");
        for (Flyable fly : flyers) {
            System.out.println(fly.getClass().getSimpleName());
        }
    }
}