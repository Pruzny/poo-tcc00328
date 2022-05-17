package questao05;

public class ItemVenda implements Recebivel {
    private String produto;
    private int quantidade;
    private double precoUnitario;

    public ItemVenda(String produto, int quantidade, double precoUnitario) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    @Override
    public double totalizarReceita() {
        return quantidade * precoUnitario;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f (%d)", this.produto, this.precoUnitario, this.quantidade);
    }
}
