package questao03;

public class Cliente {
    private String nome;
    private String cpf;

    Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCpf(String novoCpf) {
        char[] caracteres = novoCpf.toCharArray();
        for (char c: caracteres) {
            if (!Character.isDigit(c)) {
                throw new DadoInvalidoException("Nome invalido");
            }
        }
        this.cpf = novoCpf;
    }

    public void setNome(String novoNome) {
        char[] caracteres = novoNome.toCharArray();
        for (char c: caracteres) {
            if (!Character.isLetter(c)) {
                throw new DadoInvalidoException("Nome invalido");
            }
        }
        this.nome = novoNome;
    }

    public boolean equals(Cliente outroCliente) {
        return this.cpf.equalsIgnoreCase(outroCliente.cpf);
    }
}
