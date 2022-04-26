package questao02;

import questao01.ConversaoUnidadesArea;

public class Verificador {
    private static final double TAMANHO_CAMPO = 8250;
    
    public static void verificar() {
        System.out.println("Campo de Futebol:");
        System.out.printf("%.1f metros quadrados\n", TAMANHO_CAMPO);
        System.out.printf("%.1f pes quadrados\n", ConversaoUnidadesArea.metroParaPe(TAMANHO_CAMPO));
        System.out.printf("%.1f acres\n", ConversaoUnidadesArea.metroParaAcre(TAMANHO_CAMPO));
        System.out.printf("%.1f centimetros quadrados\n", ConversaoUnidadesArea.metroParaCentimetro(TAMANHO_CAMPO));
    }
}
