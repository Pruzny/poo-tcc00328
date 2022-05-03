package questao03.ic;

public class Funcionario extends Membro {
    private String cargo;

    public Funcionario(String matricula, String nome, String email, String cargo) {
        super(matricula, nome, email);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }
}
