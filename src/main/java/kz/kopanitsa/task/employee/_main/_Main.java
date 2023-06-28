package kz.kopanitsa.task.employee._main;

import kz.kopanitsa.task.employee.model.Employee;
import kz.kopanitsa.task.employee.model.Report;

public class _Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("John Doe", 2500.00),
                new Employee("Jane Smith", 3500.00),
                new Employee("Mike Johnson", 4000.00)
        };

        Report.generateReport(employees);
    }
}
