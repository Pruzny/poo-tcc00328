package questao04;

public class FuncionarioAssalariado extends Funcionario implements Assalariado {
    private float salario;

    public FuncionarioAssalariado(String nome, float salario) {
        super(nome);
        this.salario = salario;
    }

    public FuncionarioAssalariado(String nome, float salario, float periodoSalarial) {
        super(nome);
        this.salario = salario * periodoSalarial;
    }

    @Override
    public float getSalario() {
        return salario;
    }

    @Override
    public void atualizarSalario(float novoSalario) {
        this.salario = novoSalario;
    }

    @Override
    protected float calcularPagamento() {
        return salario;
    }

    @Override
    protected void mudarSemana() {
        atualizarSalario(this.salario);
    }
}
