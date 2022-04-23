package questao02;

public class Boleto {
    private String codigo;
    private String data;
    private double valor;
    
    Boleto(String codigo, String data, double valor) {
        this.codigo = codigo;
        this.data = data;
        this.valor = valor;
    }
    
    public String getData() {
        return data;
    }
    
    public double getValor() {
        return valor;
    }
}
