package questao04;

public class FuncionarioPorHora extends Funcionario implements PorHora {
    private float salario;
    private int horaExtra;

    public FuncionarioPorHora(String nome, int salario, int horas) {
        super(nome);
        this.salario = salario;
        this.horaExtra = horas;
    }

    public FuncionarioPorHora(String nome, int salario, int horas, float periodoSalarial) {
        super(nome);
        this.salario = salario * periodoSalarial;
        this.horaExtra = horas;
    }

    @Override
    protected float calcularPagamento() {
        return (float) (this.salario * (1 + this.horaExtra * 1.5 /40));
    }

    @Override
    protected void mudarSemana() {
        this.horaExtra = 0;
    }

    @Override
    public int getHoraExtra() {
        return this.horaExtra;
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
    public void trabalhar(int horas) {
        this.horaExtra = horas;
    }
}
