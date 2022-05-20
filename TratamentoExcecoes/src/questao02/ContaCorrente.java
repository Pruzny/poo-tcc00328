package questao02;

public class ContaCorrente {
    private float limite;
    private float saldo;
    private float valorLimite;

    ContaCorrente() {
        this.limite = 0;
        this.saldo = 0;
        this.valorLimite = 500;
    }

    public void sacar(float valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Saque de valor negativo");
        } else if (valor == 0) {
            throw new IllegalArgumentException("Saque de valor nulo");
        } else if (valor > this.saldo) {
            throw new IllegalArgumentException("Saldo insuficiente");
        } else {
            this.saldo -= valor;
        }
    }

    public void depositar(float valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Deposito de valor negativo");
        } else if (valor == 0) {
            throw new IllegalArgumentException("Deposito de valor nulo");
        } else {
            this.saldo += valor;
        }
    }

    void setValorLimite(float valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Novo limite com valor negativo");
        } else {
            this.limite = valor;
        }
    }
}
