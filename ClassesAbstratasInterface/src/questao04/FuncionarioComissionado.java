package questao04;

public class FuncionarioComissionado extends Funcionario implements Comissionado {
    private float vendas;
    private float porcentagem;

    public FuncionarioComissionado(String nome, float porcentagem, float vendas) {
        super(nome);
        this.vendas = vendas;
        this.porcentagem = porcentagem;
    }

    public FuncionarioComissionado(String nome, float porcentagem, float vendas, float periodoSalarial) {
        super(nome);
        this.vendas = vendas;
        this.porcentagem = porcentagem * periodoSalarial;
    }

    @Override
    protected float calcularPagamento() {
        return (float) (vendas * 0.8);
    }

    @Override
    protected void mudarSemana() {
        this.vendas = 0;
    }

    @Override
    public float getVendas() {
        return vendas;
    }

    @Override
    public float getPorcentagem() {
        return porcentagem;
    }

    @Override
    public void atualizarPorcentagem(float novaPorcentagem) {
        this.porcentagem = novaPorcentagem;
    }

    @Override
    public void vender(int quantidade) {
        this.vendas = quantidade;
    }
}
