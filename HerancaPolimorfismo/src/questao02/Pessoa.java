package questao02;

public class Pessoa {
    protected String endereco;
    
    protected Pessoa(String endereco) {
        this.endereco = endereco;
    }
    
    public String getEndereco() {
        return endereco;
    }
}
