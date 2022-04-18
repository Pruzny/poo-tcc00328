package questao03.questao01;

import java.util.Scanner;

public class Agenda {
    private Contato[] lista = new Contato[100];
    private int tamanho = 0;
    
    public void criarContato() {
        if (tamanho < 99) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Digite o nome: ");
            String nome = teclado.nextLine();
            System.out.println("Digite o celular: ");
            String celular = teclado.nextLine();
            Contato contato = new Contato(nome, celular);
            lista[tamanho] = contato;
            tamanho++;
        }
    }
    
    public void mostrarAgenda() {
        System.out.println("=====AGENDA TELEFONICA=====");
        for (int i=0; i<tamanho; i++) {
            System.out.printf("Contato %d:\n", i+1);
            System.out.printf("Nome: %s\n", lista[i].getNome());
            System.out.printf("Celular: %s\n\n", lista[i].getCelular());
        }
    }
}
