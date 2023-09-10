package in.pspk;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

public class EmployeeStreamOperations {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "John", 30, 50000.0),
                new Employee(2, "Alice", 28, 60000.0),
                new Employee(3, "Bob", 25, 45000.0),
                new Employee(4, "Eva", 32, 55000.0),
                new Employee(5, "David", 29, 52000.0)
        );

        // Print all employees
        System.out.println("All employees: ");
        employees.forEach(System.out::println);

        // Filter employees by age
        List<Employee> youngEmployees = employees.stream()
                .filter(emp -> emp.getAge() < 30)
                .collect(Collectors.toList());
        System.out.println("\nYoung employees: ");
        youngEmployees.forEach(System.out::println);

        // Find the highest paid employee
        Employee highestPaidEmployee = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary)).orElseThrow(() -> new NoSuchElementException("No employee found"));
        System.out.println("\nHighest paid employee: " + highestPaidEmployee);


        // Calculate average salary
        double averageSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);
        System.out.println("\nAverage salary: " + averageSalary);

        // Count employees by age
        long employeeCountByAge = employees.stream()
                .filter(emp -> emp.getAge() >= 30)
                .count();
        System.out.println("\nNumber of employees aged 30 and above: " + employeeCountByAge);

        // Group employees by age
        System.out.println("\nEmployees grouped by age: ");
        employees.stream()
                .collect(Collectors.groupingBy(Employee::getAge))
                .forEach((age, empList) -> System.out.println("Age " + age + ": " + empList));

        // Increase salary of all employees by 10%
        List<Employee> increasedSalaryEmployees = employees.stream()
                .map(emp -> new Employee(emp.getId(), emp.getName(), emp.getAge(), emp.getSalary() * 1.10))
                .collect(Collectors.toList());
        System.out.println("\nEmployees with increased salary: ");
        increasedSalaryEmployees.forEach(System.out::println);
    }
}
