package questao01;

public class Retangulo extends FormaGeometrica {
    private float lado1;
    private float lado2;
    Retangulo(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        calcularArea();
        calcularPerimetro();
    }

    @Override
    protected void calcularArea() {
        area = lado1 * lado2;
    }

    @Override
    protected void calcularPerimetro() {
        perimetro = lado1*2 + lado2*2;
    }
}
