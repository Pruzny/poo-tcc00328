package questao01;

public class Calendario {
    private enum DiaDaSemana {
        DOMINGO,
        SEGUNDA,
        TERCA,
        QUARTA,
        QUINTA,
        SEXTA,
        SABADO;
        
        public static boolean ehDiaUtil(DiaDaSemana dia) {
            return !(dia == SABADO || dia == DOMINGO);
        }
    }
    
    public static void verificarData() {
        DiaDaSemana dia = DiaDaSemana.TERCA;
        if (DiaDaSemana.ehDiaUtil(dia)) {
            System.out.println("Eh dia util");
        } else {
            System.out.println("Nao eh dia util");
        }
    }
}
