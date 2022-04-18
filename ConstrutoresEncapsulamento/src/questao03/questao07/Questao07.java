package questao03.questao07;

public class Questao07 {
    public static void questao07() {
        Supermercado guanabara = new Supermercado();
        guanabara.novoPedido();
        mostrarMercado(guanabara);
    }
    static void mostrarMercado(Supermercado mercado) {
        System.out.println("=====SUPERMERCADO=====");
        for (int i=0; i<mercado.getTotal(); i++) {
            System.out.printf("Pedido [%d]:\n\n", i + 1);
            Pedido pedido = mercado.getPedido(i);
            for (int j=0; j<pedido.getTotal(); j++) {
                Item item = pedido.getItem(j);
                System.out.printf("Item [%d]: %s (%d)\n", j+1, item.getProduto().getNome(), item.getQuantidade());
            }
        }
    }
}
