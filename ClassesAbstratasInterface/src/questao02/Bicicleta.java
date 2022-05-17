package questao02;

public class Bicicleta implements CarbonFootprint{
    private double tamanhoAro;
    
    public Bicicleta(double tamanhoAro) {
        this.tamanhoAro = tamanhoAro;
    }
    
    @Override
    public double getCarbonFootprint() {
        return tamanhoAro*2;
    }
    
    @Override
    public String toString() {
        return String.format("%.2f\n", tamanhoAro);
    }
}
