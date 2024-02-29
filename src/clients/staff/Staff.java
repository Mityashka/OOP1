package clients.staff;

import java.time.LocalDate;

public abstract class Staff {
    protected String name;
    protected LocalDate age;
    protected String specialization;
    protected double salary;

    public Staff(String name, LocalDate age, String specialization, double salary) {
        this.name = name;
        this.age = age;
        this.specialization = specialization;
        this.salary = salary;
    }

    public String getType() {
        return getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }

    public LocalDate getAge() {
        return age;
    }

    public String getSpecialization() {
        return specialization;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return String.format("name = %s, age = %s, specialization = %s, salary = %s",
                name, age, specialization, salary);
    }
}
