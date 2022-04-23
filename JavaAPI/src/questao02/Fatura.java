package questao02;

import java.util.ArrayList;

public class Fatura {
    private String data;
    private double valorTotal;
    private double valorPago;
    private String nome;
    private ArrayList<Pagamento> pagamentos = new ArrayList<>();
    private boolean paga;
    
    Fatura(String data, double valor, String nome) {
        this.data = data;
        this.valorTotal = valor;
        this.nome = nome;
        this.paga = false;
        this.valorPago = 0;
    }

    void addPagamento(Pagamento pagamento) {
        pagamentos.add(pagamento);
    }

    void addValorPago(double valor) {
        valorPago += valor;
    }

    public double getValorPago() {
        return valorPago;
    }

    ArrayList<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public boolean estaPaga() {
        return paga;
    }

    public void setPaga(boolean bool) {
        paga = bool;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    void imprimir() {
        System.out.printf("FATURA: %s\n", nome);
        System.out.printf("Valor: %.2f\n", valorTotal);
        System.out.printf("Data: %s\n", data);

        if (paga) {
            System.out.printf("Paga: sim\n");
        } else {
            System.out.printf("Paga: nao\n");
        }

        System.out.printf("\nPagamentos:\n");
        for (Pagamento pagamento: pagamentos) {
            System.out.printf("Valor: %.2f\n", pagamento.getValor());
            System.out.printf("Data: %s\n", pagamento.getData());
            System.out.printf("Tipo: %s\n\n", pagamento.getTipo());
        }
        System.out.printf("Total: %.2f\n", valorPago);
    }
}
