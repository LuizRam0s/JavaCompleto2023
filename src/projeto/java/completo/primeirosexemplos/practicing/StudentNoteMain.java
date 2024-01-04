package projeto.java.completo.primeirosexemplos.practicing;

import java.util.Locale;
import java.util.Scanner;

public class StudentNoteMain {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        StudentNote studentNote = new StudentNote();
        System.out.print("Digite seu nome: ");
        studentNote.name = sc.nextLine();
        System.out.println("Enter the first note from 1 to 30:: ");
        studentNote.grade1 = sc.nextDouble();
        System.out.println("Enter the second note from 1 to 35: ");
        studentNote.grade2 = sc.nextDouble();
        System.out.println("Enter the third note from 1 to 35: ");
        studentNote.grade3 = sc.nextDouble();

        if (studentNote.finalGrade() >= 60) {
            System.out.printf("Final Grade =%.2f ", studentNote.finalGrade());
            System.out.println("Congratulations you passed");
        } else {
            System.out.printf("Final Grade = %.2f%n", studentNote.finalGrade());
            System.out.println("Failed");
            System.out.printf("Missing %.2f points", studentNote.missingNote());

            sc.close();
        }
    }
}