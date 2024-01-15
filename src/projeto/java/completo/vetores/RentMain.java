package projeto.java.completo.vetores;

import java.util.Locale;
import java.util.Scanner;

public class RentMain {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] vector = new Rent[10];

        System.out.print("Hom many rooms will be rented? ");
        int number = sc.nextInt();
        System.out.println();

        for (int i = 1; i<= number; i++){
            System.out.println("Rent #" + i + ":");
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();
            System.out.println();
            vector[roomNumber] = new Rent(name, email);
        }

        for (int i = 0; i < vector.length; i++ )
            if (vector[i] != null){
                System.out.println(i + ": " + vector[i]);
            }
        sc.close();
    }
}