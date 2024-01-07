package projeto.java.completo.primeirosexemplos.currencyconverter;
import java.util.Locale;
import java.util.Scanner;
public class CurrencyConverterMain{

    public static void main(String[]args){
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double price = sc.nextDouble();
        System.out.println();
        System.out.print("How many dollars will be bought? ");
        int amount = sc.nextInt();
        System.out.println();
        double result = CurrencyConverter.currencyConverter(price, amount);
        System.out.printf("Amount to be paid in reais = %.2f", result);
    }
}

