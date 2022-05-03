package questao02;

public class PessoaJuridica extends Pessoa {
    private String razaoSocial;
    private String cnpj;
    private double faturamento;
    
    public PessoaJuridica(String endereco, String razaoSocial, String cnpj, double faturamento) {
        super(endereco);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.faturamento = faturamento;
    }
    
    public String getRazaoSocial() {
        return razaoSocial;
    }
    
    public String getCnpj() {
        return cnpj;
    }
    
    public double getFaturamento() {
        return faturamento;
    }
}
