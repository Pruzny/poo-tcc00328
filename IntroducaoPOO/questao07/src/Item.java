public class Item {
    Produto produto;
    int quantidade;

    void novoProduto(String n) {
        produto = new Produto();
        produto.nome = n;
    }
}
