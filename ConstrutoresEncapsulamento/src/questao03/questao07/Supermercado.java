package questao03.questao07;

import java.util.Scanner;

public class Supermercado {
    private Pedido[] pedidos = new Pedido[100];
    private int total = 0;

    public void novoPedido() {
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

    int getTotal() {
        return total;
    }

    Pedido getPedido(int index) {
        if (index >=0 && total > index) {
            return pedidos[index];
        } else {
            return null;
        }
    }
}
