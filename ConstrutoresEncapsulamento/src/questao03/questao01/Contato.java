package questao03.questao01;

public class Contato {
    private String nome;
    private String celular;

    Contato(String n, String c) {
        this.nome = n;
        this.celular = c;
    }

    String getNome() {
        return nome;
    }

    String getCelular() {
        return celular;
    }
}
