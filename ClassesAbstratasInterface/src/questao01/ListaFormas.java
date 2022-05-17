package questao01;

import java.util.ArrayList;

public class ListaFormas<T extends FormaGeometrica> {
    private ArrayList<T> formas;
    
    ListaFormas() {
        formas = new ArrayList();
    }
    
    public void addForma(T forma) {
        formas.add(forma);
    }
    
    public float somaArea() {
        float soma = 0;
        for (T forma: formas) {
            soma += forma.area;
        }
        return soma;
    }
    
    public float somaPerimetro() {
        float soma = 0;
        for (T forma: formas) {
            soma += forma.perimetro;
        }
        return soma;
    }
}
