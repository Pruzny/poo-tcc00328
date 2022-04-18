package questao03.questao05;

import java.util.Scanner;

public class Televisao {
    private boolean ligada = false;
    private int volume = 0;
    private int canal = 1;
    private boolean silencioso = false;
    
    public void ligar() {
        ligada = !ligada;
    }
    
    public void mudarVolume() {
        Scanner teclado = new Scanner(System.in);
        int escolha;
        System.out.println("=====MUDAR VOLUME=====");
        do {
            System.out.println("Anterior [10] | Próximo [11] | Outro [0-9]");
            escolha = teclado.nextInt();
        } while (escolha < 0 || escolha > 11 || (escolha == 10 && volume == 0) || (escolha == 11 && volume == 9));
        if (escolha < 10)
            volume = escolha;
        else if (escolha == 10)
            volume--;
        else
            volume++;
    }
    
    public void mudarCanal() {
        Scanner teclado = new Scanner(System.in);
        int escolha;
        System.out.println("=====MUDAR CANAL=====");
        do {
            System.out.println("Anterior [100] | Próximo [101] | Outro [1-99]");
            escolha = teclado.nextInt();
        } while (escolha < 0 || escolha > 101 || (escolha == 100 && canal == 1) || (escolha == 101 && canal == 99));
        if (escolha < 100)
            canal = escolha;
        else if (escolha == 100)
            canal--;
        else
            canal++;
    }
    
    public void silencioso() {
        silencioso = !silencioso;
    }
    
    public void estadoAtual() {
        String estado, modoSilencioso = "está no modo silencioso.";
        if (ligada)
            estado = "ligada";
        else
            estado = "desligada";
        if (!silencioso)
            modoSilencioso = "NÃO " + modoSilencioso;
        
        System.out.printf("A tv está %s no canal %d, volume %d e %s\n",
                estado, canal, volume, modoSilencioso);
    }
}
