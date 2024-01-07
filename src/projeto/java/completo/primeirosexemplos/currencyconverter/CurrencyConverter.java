package projeto.java.completo.primeirosexemplos.currencyconverter;

public class CurrencyConverter {

    public static double price;
    public static double amount;
    public static double iof = 0.06;


    public static double currencyConverter(double price, int amount){
        return price * amount * (1 + iof);
    }
}

