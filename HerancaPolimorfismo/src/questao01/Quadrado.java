package questao01;

public class Quadrado extends Figura {
    private double lado;
    
    public Quadrado(double lado) {
        this.lado = lado;
        calcularArea();
    }
    
    private void calcularArea() {
        area = lado*lado;
    }
    
    public double getArea() {
        return area;
    }
}
