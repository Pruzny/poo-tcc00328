import java.util.Scanner;

public class Porta{
    String cor = "marrom";
    boolean aberta = false;
    double largura = 0.8;
    double altura = 2;
    double profundidade = 0.1;
    
    void mexer() {
        aberta = !aberta;
    }
    
    void pintar() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nova cor da porta:");
        cor = teclado.nextLine();
    }
    
    void mudarTamanho() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Largura:");
        largura = teclado.nextDouble();
        System.out.println("Altura:");
        altura = teclado.nextDouble();
        System.out.println("Profundidade:");
        profundidade = teclado.nextDouble();
    }
}
