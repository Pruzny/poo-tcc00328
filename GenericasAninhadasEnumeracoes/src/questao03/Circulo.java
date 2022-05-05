package questao03;

public class Circulo extends FormaGeometrica {
    private static final float PI = (float) Math.PI;
    
    public Circulo(float raio) {
        calcularArea(raio);
        calcularPerimetro(raio);
    } 
    
    private void calcularArea(float raio) {
        area = PI * raio * raio;
    }
    
    private void calcularPerimetro(float raio) {
        perimetro = 2 * PI * raio;
    }
}
