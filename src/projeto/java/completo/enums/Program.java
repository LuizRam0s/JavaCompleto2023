package projeto.java.completo.enums;

import java.util.Date;

public class Program {

    public static void main(String[] args) {

        Order number1 = new Order(85,  new Date(), OrderStatus.PROCESSING);
        System.out.println(number1);

        OrderStatus order1 = OrderStatus.DELIVERED;
        OrderStatus order2 = OrderStatus.valueOf("SHIPPED");
        System.out.println(order1);
        System.out.println(order2);
    }
}
