package kz.kopanitsa.task.employee.model;

public class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println("Salary Report:");
        System.out.printf("%-20s %10s%n", "Employee", "Salary");
        System.out.println("-------------------------------------");

        for (Employee employee : employees) {
            String fullName = employee.getFullName();
            double salary = employee.getSalary();
            System.out.printf("%-20s %,10.2f%n", fullName, salary);
        }
    }
}