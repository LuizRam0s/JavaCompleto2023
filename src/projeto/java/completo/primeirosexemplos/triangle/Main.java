package projeto.java.completo.primeirosexemplos.triangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the measures of triangle first triangle:");
        Triangle firstTriangle = new Triangle();
        firstTriangle.sideA = sc.nextDouble();
        firstTriangle.sideB = sc.nextDouble();
        firstTriangle.sideC = sc.nextDouble();

        System.out.println("Enter the measures of triangle second triangle:");
        Triangle secondTriangle = new Triangle();
        secondTriangle.sideA = sc.nextDouble();
        secondTriangle.sideB = sc.nextDouble();
        secondTriangle.sideC = sc.nextDouble();

        System.out.println("First triangle " + firstTriangle);
        System.out.println("Second triangle " + secondTriangle);

        sc.close();
    }
}