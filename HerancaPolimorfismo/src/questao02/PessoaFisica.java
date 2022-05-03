package questao02;

public class PessoaFisica extends Pessoa {
    private String nome;
    private String cpf;
    private String aniversario;
    
    public PessoaFisica(String endereco, String nome, String cpf, String aniversario) {
        super(endereco);
        this.nome = nome;
        this.cpf = cpf;
        this.aniversario = aniversario;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public String getAniversario() {
        return aniversario;
    }
}
