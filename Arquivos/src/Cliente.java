import java.io.Serializable;

public class Cliente implements Serializable {
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
                throw new DadoException("Nome invalido.");
            }
        }
        this.cpf = novoCpf;
    }

    public void setNome(String novoNome) {
        char[] caracteres = novoNome.toCharArray();
        for (char c: caracteres) {
            if (!Character.isLetter(c)) {
                throw new DadoException("Nome invalido.");
            }
        }
        this.nome = novoNome;
    }

    public boolean equals(Cliente outroCliente) {
        return this.cpf.equalsIgnoreCase(outroCliente.cpf);
    }

    public String toString() {
        return String.format(
                "Nome: %s\n" +
                "CPF: %s",
                this.nome,
                this.cpf
        );
    }
}
