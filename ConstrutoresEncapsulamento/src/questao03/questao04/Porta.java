package questao03.questao04;

import java.util.Scanner;

public class Porta{
    String cor = "marrom";
    private boolean aberta = false;
    private double largura = 0.8;
    private double altura = 2;
    private double profundidade = 0.1;

    Porta(String c, double l, double h, double p) {
        this.cor = c;
        this.largura = l;
        this.altura = h;
        this.profundidade = p;
    }
    
    void inverterAberta() {
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

    public boolean estaAberta() {
        return aberta;
    }
}
