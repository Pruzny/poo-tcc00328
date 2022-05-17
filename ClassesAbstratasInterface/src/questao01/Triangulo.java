package questao01;

public class Triangulo extends FormaGeometrica {
    private float base;
    private float altura;
    private float lado1;
    private float lado2;
    private float lado3;
    Triangulo(float base, float altura, float lado1, float lado2, float lado3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        calcularArea();
        calcularPerimetro();
    }

    @Override
    protected void calcularArea() {
        area = base * altura / 2;
    }

    @Override
    protected void calcularPerimetro() {
        perimetro = lado1 + lado2 + lado3;
    }
}
