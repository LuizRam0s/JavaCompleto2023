package projeto.java.completo.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Negative {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers will you type: ");
        int n = sc.nextInt();
        int[] vetorNumber= new int[n];

        for (int i = 0; i < n; i++){
            System.out.print("Enter from number: ");
            vetorNumber[i]= sc.nextInt();
        }
        System.out.println();
        System.out.println("Negative numbers are: ");
        for (int i = 0; i < n; i++){
            if (vetorNumber[i] < 0){
                System.out.println(vetorNumber[i]);
            }
        }








    sc.close();
    }
}
