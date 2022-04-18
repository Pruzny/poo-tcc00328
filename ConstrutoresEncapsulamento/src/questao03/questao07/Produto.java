package questao03.questao07;

public class Produto {
    private String nome;
    private int estoque;

    Produto(String n, int e) {
        this.nome = n;
        this.estoque = e;
    }

    String getNome() {
        return nome;
    }

    int getEstoque() {
        return estoque;
    }

    void setEstoque(int e) {
        estoque = e;
    }
}
