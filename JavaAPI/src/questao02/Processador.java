package questao02;

import java.util.ArrayList;

public class Processador {
    void processarBoletos(ArrayList<Boleto> boletos, Fatura fatura) {
        if (!fatura.estaPaga()) {
            for (Boleto boleto : boletos) {
                Pagamento pagamento = new Pagamento(boleto.getValor(), boleto.getData(), "BOLETO");
                fatura.addPagamento(pagamento);
                fatura.addValorPago(boleto.getValor());
            }
            if (fatura.getValorPago() >= fatura.getValorTotal()) {
                fatura.setPaga(true);
                System.out.println("Fatura paga!");
            } else {
                System.out.println("Fatura ainda não está fechada.");
            }
        } else {
            System.out.println("Fatura já está paga. Boletos não processados.");
        }
    }
}
