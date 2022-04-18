package questao03.questao03;

import java.util.Scanner;

public class Porta {
    private String cor;
    private boolean aberta = false;
    private double largura;
    private double altura;
    private double profundidade;
    
    void mexer() {
        aberta = !aberta;
    }
    
    void pintar() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nova cor:");
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

    Porta(String c, double l, double h, double p) {
        cor = c;
        largura = l;
        altura = h;
        profundidade = p;
    }

    public boolean estaAberta() {
        return aberta;
    }

    public String getCor() {
        return cor;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    public double getProfundidade() {
        return profundidade;
    }
}
