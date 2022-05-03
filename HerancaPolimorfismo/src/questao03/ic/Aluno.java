package questao03.ic;

public class Aluno extends Membro {
    private String curso;

    public Aluno(String matricula, String nome, String email, String curso) {
        super(matricula, nome, email);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }
}
