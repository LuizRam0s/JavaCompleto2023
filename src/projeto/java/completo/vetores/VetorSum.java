package projeto.java.completo.vetores;

import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Scanner;

public class VetorSum {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers will you type: ");
        int n = sc.nextInt();
        double[] vetorNumber = new double[n];
        double sum = 0;

        for (int i = 0; i < vetorNumber.length; i++) {
            System.out.print("Enter from number: ");
            vetorNumber[i] = sc.nextDouble();
        }

        System.out.println();
        System.out.print("Numbers: ");
        for(int i = 0; i < vetorNumber.length; i++) {
            System.out.print(vetorNumber[i] + " ");
        }

        for(int i = 0; i < vetorNumber.length; i++) {
            sum += vetorNumber[i];
        }

        System.out.println();
        System.out.printf("The sum is: %.2f%n", sum);
        System.out.printf("The avg is: %.2f%n", (sum/n));

        sc.close();
    }
}