package questao01;

import java.util.Scanner;

public class Calculadora {
    private static Scanner teclado = new Scanner(System.in);
    public static void calcular() {
        double comprimento, largura;
        System.out.println("RETANGULO");
        System.out.println("Comprimento: ");
        comprimento = Double.parseDouble(teclado.next());
        System.out.println("Largura: ");
        largura = Double.parseDouble(teclado.next());
        Retangulo retangulo = new Retangulo(comprimento, largura);
        System.out.printf("Area = %.2f m²\n\n", retangulo.getArea());
        
        double lado;
        System.out.println("QUADRADO");
        System.out.println("Lado: ");
        lado = Double.parseDouble(teclado.next());
        Quadrado quadrado = new Quadrado(lado);
        System.out.printf("Area = %.2f m²\n\n", quadrado.getArea());
        
        double base, altura;
        System.out.println("TRIANGULO");
        System.out.println("Base:");
        base = Double.parseDouble(teclado.next());
        System.out.println("Altura:");
        altura = Double.parseDouble(teclado.next());
        Triangulo triangulo = new Triangulo(base, altura);
        System.out.printf("Area = %.2f m²\n\n", triangulo.getArea());
        
        double raio;
        System.out.println("CIRCULO");
        System.out.println("Raio: ");
        raio = Double.parseDouble(teclado.next());
        Circulo circulo = new Circulo(raio);
        System.out.printf("Area = %.2f m²\n", circulo.getArea());
    }
}
