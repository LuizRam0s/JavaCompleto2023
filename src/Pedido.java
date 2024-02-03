import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private static final DateTimeFormatter estiloData2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    private LocalDateTime dataPedido;
    private StatusPedido status;
    private Cliente cliente;
    private List<ItensDoPedido> itens = new ArrayList<ItensDoPedido>();

    public Pedido() {
    }

    public Pedido(LocalDateTime dataPedido, StatusPedido status, Cliente cliente) {
        this.dataPedido = dataPedido;
        this.status = status;
        this.cliente = cliente;
    }

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDateTime dataPedido) {
        this.dataPedido = dataPedido;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionarItem(ItensDoPedido item) {
        itens.add(item);
    }

    public void removeItem(ItensDoPedido item) {
        itens.remove(item);
    }

    public double totalCompra() {
        double soma = 0.0;
        for (ItensDoPedido item : itens) {
            soma = soma + item.subTotal();
        }
        return soma;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Momento do pedido: ");
        sb.append(estiloData2.format(dataPedido) + "\n");
        sb.append("Status do pedido: ");
        sb.append(status + "\n");
        sb.append("Client: ");
        sb.append(cliente + "\n");
        sb.append("Itens do pedido:\n");
        for (ItensDoPedido item : itens) {
            sb.append(item + "\n");
        }
        sb.append("Preço total: $");
        sb.append(String.format("%.2f", totalCompra()));
        return sb.toString();
    }
}
