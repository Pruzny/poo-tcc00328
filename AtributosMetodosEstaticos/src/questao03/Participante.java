package questao03;

import questao03.ic.*;

public class Participante {
    private String matricula;
    private String nome;
    private String email;
    
    public Participante(Aluno aluno) {
        this.matricula = aluno.getMatricula();
        this.nome = aluno.getNome();
        this.email = aluno.getEmail();
    }
    
    public Participante(Professor professor) {
        this.matricula = professor.getMatricula();
        this.nome = professor.getNome();
        this.email = professor.getEmail();
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
