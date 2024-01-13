package projeto.java.completo.vetores;

import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Scanner;

public class EvenNumber {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers will you enter? ");
        int n = sc.nextInt();
        int[] numberVect = new int[n];

        for (int i =0; i < numberVect.length; i++ ) {
            System.out.print("Enter a number: ");
            numberVect[i] = sc.nextInt();
        }

        System.out.println();
        int quantityEvenNumbers = 0;
        System.out.println("Even number: ");
        for (int i = 0; i < numberVect.length; i++){
            if(numberVect[i] % 2 == 0){
                System.out.printf("%d ", numberVect[i]);
                quantityEvenNumbers++;
            }
        }

        System.out.printf("%n%n");

        System.out.printf("Quantity even numbers %d", quantityEvenNumbers);

        sc.close();
    }
}
