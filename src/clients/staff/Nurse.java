package clients.staff;
import clients.Animal;
import java.time.LocalDate;

public class Nurse extends Staff{
    public Nurse(String name, LocalDate age, String specialization, double salary) {super(name, age, specialization, salary);
    }
    public void injection(){
        System.out.println(this.getName()+ " give an injection to %s" + this.getName());
    }
    public void help(){
        System.out.println(this.getName() + " help to a Doctor %s");
    }
}
