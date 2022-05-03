package questao03;

import questao03.ic.*;

public class Participante {
    private String matricula;
    private String nome;
    private String email;
    private String relacao;
    
    public Participante(Aluno aluno) {
        this.matricula = aluno.getMatricula();
        this.nome = aluno.getNome();
        this.email = aluno.getEmail();
        this.relacao = aluno.getCurso();
    }
    
    public Participante(Professor professor) {
        this.matricula = professor.getMatricula();
        this.nome = professor.getNome();
        this.email = professor.getEmail();
        this.relacao = professor.getDepartamento();
    }

    public Participante(Funcionario funcionario) {
        this.matricula = funcionario.getMatricula();
        this.nome = funcionario.getNome();
        this.email = funcionario.getEmail();
        this.relacao = funcionario.getCargo();
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getEmail() {
        return email;
    }
}
