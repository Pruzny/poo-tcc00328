import questao01.Calendario;
import questao02.Verificador;
import questao03.Questao03;

public class Questoes {
    public static void questao(int num) {
        switch (num) {
            case 1:
                Calendario.verificarData();
                break;
            case 2:
                Verificador.verificar();
                break;
            case 3:
                Questao03.questao03();
        }
    }
}
