package projeto.java.completo.primeirosexemplos.product;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product firstProduct = new Product();
        System.out.println("Enter product data:");
        System.out.print("Name: ");
        firstProduct.name = sc.next();
        System.out.print("Price: ");
        firstProduct.price = sc.nextDouble();
        System.out.print("Quantity: ");
        firstProduct.quantity = sc.nextInt();
        System.out.println(firstProduct);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        firstProduct.addProducts(sc.nextInt());
        System.out.println();
        System.out.println("Updated " + firstProduct);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        firstProduct.removeProducts(sc.nextInt());
        System.out.println();
        System.out.println("Updated " + firstProduct);


        sc.close();
    }
}
