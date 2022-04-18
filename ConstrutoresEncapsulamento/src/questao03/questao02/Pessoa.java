package questao03.questao02;

import java.util.Scanner;

public class Pessoa {
    private String nome;
    private int idadeInicial;
    private int idadeFinal;
    
    void aniversario() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos aniversários essa pessoa já fez?");
        int aniversarios = teclado.nextInt();
        idadeFinal = idadeInicial + aniversarios;
    }

    Pessoa(String nm, int idadeI) {
        nome = nm;
        idadeInicial = idadeI;
        idadeFinal = idadeI;
    }

    String getNome() {
        return nome;
    }

    int getIdadeFinal() {
        return idadeFinal;
    }
}
