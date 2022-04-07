import java.util.Scanner;

public class Agenda {
    Contato[] lista = new Contato[100];
    int tamanho = 0;
    
    void criarContato() {
        if (tamanho < 99) {
            Contato contato = new Contato();
            Scanner teclado = new Scanner(System.in);
            System.out.println("Digite o nome: ");
            contato.nome = teclado.nextLine();
            System.out.println("Digite o celular: ");
            contato.celular = teclado.nextLine();
            lista[tamanho] = contato;
            tamanho++;
        }
    }
    
    void mostrarAgenda() {
        System.out.println("=====AGENDA TELEFONICA=====");
        for (int i=0; i<tamanho; i++) {
            System.out.printf("Contato %d:\n", i+1);
            System.out.printf("Nome: %s\n", lista[i].nome);
            System.out.printf("Celular: %s\n\n", lista[i].celular); 
        }
    }
}
