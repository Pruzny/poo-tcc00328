import java.util.Scanner;

public class Casa {
    String cor = "branca";
    Porta[] portas = new Porta[20];
    int quantidadePortas = 3;
    
    void mudarCor() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nova cor da casa:");
        cor = teclado.nextLine();
    }
    
    void criarPortas() {
        for (int i=0; i<quantidadePortas; i++) {
            Porta novaPorta = new Porta();
            portas[i] = novaPorta;
        }
    }
    
    void quantasPortasEstaoAbertas() {
        int contador = 0;
        for (int i=0; i<quantidadePortas; i++) {
            if (portas[i].aberta)
                contador++;
        }
        System.out.printf("A quantidade de portas abertas é %d.\n", contador);
    }
}
