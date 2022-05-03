package questao01;

public class Retangulo extends Figura {
    private double comprimento;
    private double largura;
    
    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
        calcularArea();
    }
    
    private void calcularArea() {
        area = comprimento*largura;
    }
    
    public double getArea() {
        return area;
    }
}
