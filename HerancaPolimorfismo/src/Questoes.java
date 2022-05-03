import questao01.Calculadora;
import questao02.Programa;
import questao03.Organizador;
import questao04.Jogo;

public class Questoes {
    public static void questao(int num) {
        switch (num) {
            case 1:
                Calculadora.calcular();
                break;
            case 2:
                Programa.executar();
                break;
            case 3:
                Organizador.montarEvento();
                break;
            case 4:
                Jogo.jogar();
        };
    }
}
