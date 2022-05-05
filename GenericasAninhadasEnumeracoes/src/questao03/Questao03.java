package questao03;

public class Questao03 {
    public static void questao03() {
        ListaFormas lista = new ListaFormas();
        
        lista.addForma(new Circulo(1));
        lista.addForma(new Quadrado(4));
        lista.addForma(new Retangulo(2, 4));
        lista.addForma(new Triangulo(3, 4, 3, 4, 5));
        
        float somaArea = lista.somaArea();
        float somaPerimetro = lista.somaPerimetro();
        
        System.out.printf("A soma das areas eh igual a %.2f\n", somaArea);
        System.out.printf("A soma dos perimetros eh igual a %.2f\n", somaPerimetro);
    }
}
