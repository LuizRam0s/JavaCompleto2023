package projeto.java.completo.vetores;

import java.util.Locale;
import java.util.Scanner;

public class SumVect {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many vector numbers will you enter? ");
        int n = sc.nextInt();
        int[] numberVector = new int[n];
        int[] numberVector1 = new int[n];
        int[] numberVector2 = new int[n];

        System.out.println("Enter a number vector 1:");
        for (int i = 0; i < numberVector.length;i++){
            numberVector[i] = sc.nextInt();
        }

        System.out.println("Enter a number vector 2: ");
        for (int i = 0; i < numberVector1.length;i++){
            numberVector1[i] = sc.nextInt();
        }

        System.out.println("Result number vector 3: ");
        for (int i = 0; i < numberVector2.length;i++){
            numberVector2[i] = numberVector[i] + numberVector1[i];
            System.out.println(numberVector2[i]+ " ");
        }


        sc.close();
    }
}
