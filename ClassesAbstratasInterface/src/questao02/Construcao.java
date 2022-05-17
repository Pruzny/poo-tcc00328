package questao02;

public abstract class Construcao implements CarbonFootprint {
    private int numPessoas;
    private boolean energiaRenovavel;
    private int numLampadas;
    private boolean arCondicionado;
    
    public Construcao(int numPessoas, boolean energiaRenovavel, int numLampadas, boolean arCondicionado) {
        this.numPessoas = numPessoas;
        this.energiaRenovavel = energiaRenovavel;
        this.numLampadas = numLampadas;
        this.arCondicionado = arCondicionado;
    }
    
    @Override
    public double getCarbonFootprint() {
        double energia = 1.8;
        if (energiaRenovavel) {
            energia = 0.5;
        }
        if (arCondicionado) {
            energia *= 2;
        }
        return numPessoas*numLampadas*energia;
    }
    
    public int getNumPessoas() {
        return numPessoas;
    }

    public boolean temEnergiaRenovavel() {
        return energiaRenovavel;
    }
    
    @Override
    public String toString() {
        if (energiaRenovavel) {
            return String.format("Moradores: %d (renovavel)\n", numPessoas);
        }
        return String.format("Moradores: %d\n", numPessoas);
    }
}
