package questao04;

public abstract class Funcionario {
    protected String nome;

    protected Funcionario(String nome) {
        this.nome = nome;
    }

    protected abstract float calcularPagamento();

    protected abstract void mudarSemana();

    public String getNome() {
        return this.nome;
    }
}
