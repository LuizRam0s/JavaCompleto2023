package projeto.java.completo.vetores;

import java.util.Locale;
import java.util.Scanner;

public class ArithmeticMeanVectors {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements will the vector have?");
        int n = sc.nextInt();
        double[] vectorElements = new double[n];
        double soma = 0;
        for (int i = 0; i < vectorElements.length; i++) {
            System.out.print("Enter a number: ");
            vectorElements[i] = sc.nextDouble();
            soma += vectorElements[i];
        }
        double media = soma/n;
        System.out.printf("%nVector media: %.3f%n%n", media);

        System.out.println("ELEMENTS BELOW AVERAGE:");
        for (int i =0; i < n; i++){
            if (vectorElements[i]<media) {
                System.out.println(vectorElements[i]);
            }            }
        sc.close();
    }
}
