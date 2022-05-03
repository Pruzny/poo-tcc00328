package questao01;

public class Circulo extends Figura {
    private static double PI = Math.PI;
    private double raio;
    
    public Circulo(double raio) {
        this.raio = raio;
        calcularArea();
    }
    
    private void calcularArea() {
        area = Circulo.PI * raio*raio;
    }
    
    public double getArea() {
        return area;
    }
}
