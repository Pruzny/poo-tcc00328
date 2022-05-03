package questao03.ic;

public class Professor extends Membro {
    private String departamento;
    
    public Professor(String matricula, String nome, String email, String departamento) {
        super(matricula, nome, email);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }
}
