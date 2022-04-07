import java.util.Scanner;

public class Supermercado {
    Pedido[] pedidos = new Pedido[100];
    int total = 0;

    void novoPedido() {
        Scanner teclado = new Scanner(System.in);
        Pedido pedido = new Pedido();
        System.out.print("Digite a quantidade de itens: ");
        int quantidade = teclado.nextInt();
        for (int i=0; i<quantidade; i++) {
            teclado.nextLine();
            System.out.print("Digite o nome do produto: ");
            String prod = teclado.nextLine();
            System.out.print("Digite a quantidade: ");
            int quant = teclado.nextInt();
            pedido.novoItem(prod, quant);
        }
        pedidos[total] = pedido;
        total++;
    }
}
