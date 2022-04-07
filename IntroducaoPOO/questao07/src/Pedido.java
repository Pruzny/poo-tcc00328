public class Pedido {
    Item[] itens = new Item[100];
    int total = 0;

    void novoItem(String nome, int quant) {
        Item item = new Item();
        item.novoProduto(nome);
        item.quantidade = quant;
        item.produto.estoque -= quant;
        if (item.produto.estoque < 0) {
            System.out.printf("Não há estoque suficiente (%d de %d).", quant, item.produto.estoque);
        } else {
            itens[total] = item;
            total++;
        }
    }
}
