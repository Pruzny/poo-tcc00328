import java.util.Scanner;

public class Pessoa {
    String nome;
    int idadeInicial;
    int idadeFinal;
    
    void aniversario() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos aniversários essa pessoa já fez?");
        int aniversarios = teclado.nextInt();
        idadeFinal = idadeInicial + aniversarios;
    }
    
}
