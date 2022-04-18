package questao03.questao07;

public class Item {
    private Produto produto;
    private int quantidade;

    Item(String n, int q) {
        produto = new Produto(n, 10);
        quantidade = q;
    }

    Produto getProduto() {
        return produto;
    }

    int getQuantidade() {
        return quantidade;
    }
}
