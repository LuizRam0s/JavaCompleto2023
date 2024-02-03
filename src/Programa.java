import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter estiloData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do cliente");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Data de nascimento com o seguinte formato: DD/MM/YYYY: ");
        LocalDate dataNascimento = LocalDate.parse(sc.next(), estiloData);
        sc.nextLine();

        Cliente cliente = new Cliente(nome, email, dataNascimento);

        System.out.print("Status do pedido: ");
        StatusPedido status = StatusPedido.valueOf(sc.nextLine());

        Pedido pedido = new Pedido(LocalDateTime.now(), status, cliente );

        System.out.print("Quantos tipos de produtos irá comprar:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println("Entre com os dados do produto " + (i+1) +":");
            sc.nextLine();
            System.out.print("Nome: ");
            String nomeProduto =sc.nextLine();
            System.out.print("Preço: ");
            double precoProduto = sc.nextDouble();
            Produto produto = new Produto(nomeProduto, precoProduto);

            System.out.print("Quantidades: ");
            int quantidadeProdutos = sc.nextInt();
            ItensDoPedido itensPedido = new ItensDoPedido(quantidadeProdutos, precoProduto, produto);
            pedido.adicionarItem(itensPedido);
        }

        System.out.println();
        System.out.println("Ordem do Pedido: ");
        System.out.println(pedido);

        sc.close();
    }
}
