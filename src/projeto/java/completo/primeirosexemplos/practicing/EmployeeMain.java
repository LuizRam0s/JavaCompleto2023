package projeto.java.completo.primeirosexemplos.practicing;

import java.util.Locale;
import java.util.Scanner;

public class EmployeeMain {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        employee.netSalary();
        System.out.printf("Employee: " + employee.toString());
        System.out.println();

        System.out.print("Which percentage to increase salary? ");
        employee.increaseSalary(sc.nextDouble());
        System.out.println();

        System.out.println("Updated data: " + employee.toString());

        sc.close();
    }

}
