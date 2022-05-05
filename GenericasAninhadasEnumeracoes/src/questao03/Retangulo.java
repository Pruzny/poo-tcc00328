package questao03;

public class Retangulo extends FormaGeometrica {
    Retangulo(float lado1, float lado2) {
        calcularArea(lado1, lado2);
        calcularPerimetro(lado1, lado2);
    }
    
    private void calcularArea(float lado1, float lado2) {
        area = lado1 * lado2;
    }
    
    private void calcularPerimetro(float lado1, float lado2) {
        perimetro = lado1*2 + lado2*2;
    }
}
