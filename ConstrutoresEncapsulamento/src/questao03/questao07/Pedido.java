package questao03.questao07;

public class Pedido {
    private Item[] itens = new Item[100];
    private int total = 0;

    public void novoItem(String nome, int quant) {
        Item item = new Item(nome, quant);
        int novoEstoque = item.getProduto().getEstoque() - quant;
        if (novoEstoque < 0) {
            System.out.printf("Não há estoque suficiente (%d de %d).\n", quant, item.getProduto().getEstoque());
        } else {
            item.getProduto().setEstoque(novoEstoque);
            itens[total] = item;
            total++;
        }
    }

    public Item getItem(int index) {
        if (index >= 0 && total > index) {
            return itens[index];
        } else {
            return null;
        }
    }

    public int getTotal() {
        return total;
    }
}
