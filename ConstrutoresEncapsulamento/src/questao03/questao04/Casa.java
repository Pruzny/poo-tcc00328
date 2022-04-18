package questao03.questao04;

import java.util.Scanner;

public class Casa {
    private String cor;
    private Porta[] portas = new Porta[20];
    private int quantidadePortas = 3;

    Casa(String c, int q) {
        this.cor = c;
        this.quantidadePortas = q;
    }

    public void mexer(int i) {
        portas[i].inverterAberta();
    }

    public void mudarCor() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nova cor da casa:");
        cor = teclado.nextLine();
    }
    
    public void criarPortas() {
        for (int i=0; i<quantidadePortas; i++) {
            Porta novaPorta = new Porta("marrom", 0.8, 2, 0.1);
            portas[i] = novaPorta;
        }
    }
    
    public void quantasPortasEstaoAbertas() {
        int contador = 0;
        for (int i=0; i<quantidadePortas; i++) {
            if (portas[i].estaAberta())
                contador++;
        }
        System.out.printf("A quantidade de portas abertas é %d.\n", contador);
    }
}
