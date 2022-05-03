package questao01;

public class Triangulo extends Figura {
    private double base;
    private double altura;
    
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        calcularArea();
    }
    
    private void calcularArea() {
        area = base*altura/2;
    }
    
    public double getArea() {
        return area;
    }
}
