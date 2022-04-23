package questao02;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Questao02 {
    public static void questao02() {

        Fatura fatura = new Fatura("08/05/2022", 3000, "Placa de Video");
        Processador processador = new Processador();
        ArrayList<Boleto> boletos = new ArrayList<>();

        criarBoletos(boletos);

        processador.processarBoletos(boletos, fatura);
        fatura.imprimir();

    }
    static void criarBoletos(ArrayList<Boleto> boletos) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a quantidade de boletos:");
        int quant = Integer.parseInt(teclado.next());
        for (int i=0; i<quant; i++) {
            String codigo = "";
            for (int k = 0; k < 10; k++) {
                int num = (int) (Math.random() * 10);
                codigo += Integer.toString(num);
            }

            LocalDateTime hoje = LocalDateTime.now();
            DateTimeFormatter padrao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String data = padrao.format(hoje);

            System.out.printf("Valor do boleto [%d]:\n", i + 1);
            double valor = Double.parseDouble(teclado.next());

            Boleto boleto = new Boleto(codigo, data, valor);
            boletos.add(boleto);
        }
    }
}
