package questao04;

public class Ataque {
    private String nome;
    private String tipo;
    private String debuff;
    private double precisao;
    private int potencia;
    private int cargas;

    Ataque(String nome, String tipo, double precisao, int potencia, int cargas) {
        this.nome = nome;
        this.tipo = tipo;
        this.precisao = precisao;
        this.potencia = potencia;
        this.cargas = cargas;
    }

    Ataque(String nome, String tipo, String debuff, double precisao, int potencia, int cargas) {
        this.nome = nome;
        this.tipo = tipo;
        this.debuff = debuff;
        this.precisao = precisao;
        this.potencia = potencia;
        this.cargas = cargas;
    }

    public String getNome() {
        return nome;
    }

    public String getDebuff() {
        return debuff;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecisao() {
        return precisao;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getCargas() {
        return cargas;
    }

    public void setCargas(int cargas) {
        this.cargas = cargas;
    }
}
