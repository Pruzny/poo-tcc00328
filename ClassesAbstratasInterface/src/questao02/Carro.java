package questao02;

public class Carro implements CarbonFootprint{
    private String tipoCombustivel;
    private double cilindrada;
    private double quilometragem;
    private double consumoCombustivel;

    public Carro(String tipoCombustivel, double cilindrada, double quilometragem, double consumoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.cilindrada = cilindrada;
        this.quilometragem = quilometragem;
        this.consumoCombustivel = consumoCombustivel;
    }
    
    @Override
    public double getCarbonFootprint() {
        if (tipoCombustivel.equalsIgnoreCase("alcool")) {
            return cilindrada*5 * quilometragem/4 * consumoCombustivel;
        } else if (tipoCombustivel.equalsIgnoreCase("gasolina")) {
            return cilindrada*5 * quilometragem/4 * consumoCombustivel * 1.5;
        }
        return cilindrada*5 * quilometragem/4 * consumoCombustivel * 0.4;
    }
    
    @Override
    public String toString() {
        return String.format("%s: %.2f km\n", tipoCombustivel, quilometragem);
    }
}
