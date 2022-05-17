package questao01;

public class Circulo extends FormaGeometrica {
    private static final float PI = (float) Math.PI;
    private float raio;
    
    public Circulo(float raio) {
        this.raio = raio;
        calcularArea();
        calcularPerimetro();
    } 

    @Override
     protected void calcularArea() {
        area = PI * raio * raio;
    }

    @Override
    protected void calcularPerimetro() {
        perimetro = 2 * PI * raio;
    }
}
