package clients.staff;
import clients.Animal;
import java.time.LocalDate;

public class Doctor extends Staff{
    public Doctor(String name, LocalDate age, String specialization, double salary) {super(name, age, specialization, salary);
    }
    public void treat() {
        System.out.printf("доктор %s лечит%n", this.getName());
    }
    public void WritePrescription(){
        System.out.println("Доктор " + this.getName() + " печатает рецепт " + this.getType());
    }
}
