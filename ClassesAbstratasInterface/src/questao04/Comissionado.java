package questao04;

public interface Comissionado {
    float getVendas();
    float getPorcentagem();
    void atualizarPorcentagem(float novaPorcentagem);
    void vender(int quantidade);
}
