package kz.kopanitsa.task.employee.model;

public class Employee {
    private String fullName;
    private double salary;

    public Employee(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public double getSalary() {
        return salary;
    }
}
