package projeto.java.completo.vetores;

import java.util.Locale;
import java.util.Scanner;

public class HeightsMain {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people will be registered: ");
        int nPeople = sc.nextInt();
        Heights[] vect = new Heights[nPeople];

        for (int i = 0; i < vect.length; i++){
            sc.nextLine();
            System.out.println("Enter the data.");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Heights: ");
            double heights = sc.nextDouble();
            System.out.println();
        vect[i] = new Heights(name, age, heights);
        }

        double heigtAgv = 0;
        int sumAge= 0;
        for (int i = 0; i < vect.length; i++){
            heigtAgv += vect[i].getHeights();
            if (vect[i].getAge() < 16){
                sumAge ++;
            }
        }
        heigtAgv = heigtAgv / nPeople;
        System.out.printf("Average height: %.2f%n ", heigtAgv);

         double p = ((double) sumAge / nPeople) * 100;
        System.out.printf("People under 16: %.2f%%\n", p);


        for (int i =0; i < vect.length; i++){
            if (vect[i].getAge() < 16) {
               Heights[] vectAge = vect;
                System.out.println(vectAge[i].getName());
            }
        }

        sc.close();
    }

}


