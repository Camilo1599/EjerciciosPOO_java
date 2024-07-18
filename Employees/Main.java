package Employees;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee empleado1 = new Employee(0, "camilo", "Gerente", 1000);

        String name = empleado1.getName();
        double salary = empleado1.getSalary();

        System.out.println(name);
        System.out.println("Porfavor ingresa el porcentaje de aumento: ");
        double porcentage = scanner.nextDouble();

        System.out.println(empleado1.increaseSalary(salary, porcentage));
        
    }
}
