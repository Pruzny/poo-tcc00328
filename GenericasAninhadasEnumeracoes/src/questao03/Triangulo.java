package questao03;

public class Triangulo extends FormaGeometrica {
    Triangulo(float base, float altura, float lado1, float lado2, float lado3) {
        calcularArea(base, altura);
        calcularPerimetro(lado1, lado2, lado3);
    }
    
    private void calcularArea(float base, float altura) {
        area = base * altura / 2;
    }
    
    private void calcularPerimetro(float lado1, float lado2, float lado3) {
        perimetro = lado1 + lado2 + lado3;
    }
}
