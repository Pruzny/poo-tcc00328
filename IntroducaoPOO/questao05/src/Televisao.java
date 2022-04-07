import java.util.Scanner;

public class Televisao {
    boolean ligada = false;
    int volume = 0;
    int canal = 0;
    boolean silencioso = false;
    
    void ligar() {
        ligada = !ligada;
    }
    
    void mudarVolume() {
        Scanner teclado = new Scanner(System.in);
        int escolha;
        System.out.println("=====MUDAR VOLUME=====");
        System.out.println("Anterior [10] | Próximo [11] | Outro [0-9]");
        do {
            escolha = teclado.nextInt();
        } while (escolha < 0 && escolha > 11);
        if (escolha < 10)
            volume = escolha;
        else if (escolha == 10)
            volume--;
        else
            volume++;
    }
    
    void mudarCanal() {
        Scanner teclado = new Scanner(System.in);
        int escolha;
        System.out.println("=====MUDAR CANAL=====");
        System.out.println("Anterior [100] | Próximo [101] | Outro [0-99]");
        do {
            escolha = teclado.nextInt();
        } while (escolha < 0 && escolha > 101);
        if (escolha < 100)
            canal = escolha;
        else if (escolha == 100)
            canal--;
        else
            canal++;
    }
    
    void silencioso() {
        silencioso = !silencioso;
    }
    
    void estadoAtual() {
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
