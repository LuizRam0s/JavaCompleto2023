package projeto.java.completo.primeirosexemplos.Account;

import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Scanner;

public class AccountMain {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account first;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        char response = sc.next().charAt(0);


        if (response  == 'y'){
            System.out.print("Enter inicial deposit value: ");
            Double initialDeposit = sc.nextDouble();
            first = new Account(number, holder,initialDeposit);
        } else {
            first = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Account data");
        System.out.println(first.toString());

        System.out.println();

        System.out.print("Enter a deposit value: ");
        first.deposit(sc.nextDouble());
        System.out.println("Updated account data:");
        System.out.println(first.toString());

        System.out.println();

        System.out.println("Enter a withdraw value: ");
        first.withDraw(sc.nextDouble());
        System.out.println();
        System.out.println(first.toString());

        sc.close();
    }
}
