package questao04;

public class FuncionarioAssalariadoComissionado extends Funcionario implements Assalariado, Comissionado {
    private float salario;
    private float vendas;
    private float porcentagem;

    public FuncionarioAssalariadoComissionado(String nome, float salario, float porcentagem, float vendas) {
        super(nome);
        this.salario = salario;
        this.vendas = vendas;
        this.porcentagem = porcentagem;
    }

    public FuncionarioAssalariadoComissionado(String nome, float salario, float porcentagem, float vendas, float periodoSalarial) {
        super(nome);
        this.salario = salario * periodoSalarial;
        this.vendas = vendas;
        this.porcentagem = porcentagem;
    }

    @Override
    public float getSalario() {
        return salario;
    }

    @Override
    public void atualizarSalario(float novoSalario) {
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

    @Override
    protected float calcularPagamento() {
        return salario;
    }

    @Override
    protected void mudarSemana() {
        this.vendas = 0;
    }
}
