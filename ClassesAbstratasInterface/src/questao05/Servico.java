package questao05;

public class Servico implements Recebivel {
    private String descricao;
    private int horas;
    private double precoHora;

    public Servico(String descricao, int horas, double precoHora) {
        this.descricao = descricao;
        this.horas = horas;
        this.precoHora = precoHora;
    }

    @Override
    public double totalizarReceita() {
        return horas * precoHora;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f (%d)", this.descricao, this.precoHora, this.horas);
    }
}
