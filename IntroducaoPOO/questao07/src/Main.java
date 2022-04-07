public class Main {
    public static void main(String[] args) {
        Supermercado guanabara = new Supermercado();
        guanabara.novoPedido();
        mostrarMercado(guanabara);
    }
    static void mostrarMercado(Supermercado mercado) {
        System.out.println("=====SUPERMERCADO=====");
        for (int i=0; i<mercado.total; i++) {
            System.out.printf("Pedido [%d]:\n\n", i + 1);
            Pedido pedido = mercado.pedidos[i];
            for (int j=0; j<pedido.total; j++) {
                Item item = pedido.itens[j];
                System.out.printf("Item [%d]: %s (%d)\n", j+1, item.produto.nome, item.quantidade);
            }
        }
    }
}
