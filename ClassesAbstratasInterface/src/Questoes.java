import questao01.Questao01;
import questao04.Empresa;
import questao05.RegistroRecebimentos;

public class Questoes {
    public static void questao(int num) {
        switch (num) {
            case 1:
                Questao01.questao01();
                break;
            case 2:
                // Não será possível criar o objeto de construção, pois classes abstratas não são instanciáveis.
                questao02.Programa.executar();
                break;
            case 3:
                questao03.Programa.executar();
                break;
            case 4:
                Empresa.calcularPagamento();
                break;
            case 5:
                RegistroRecebimentos.executar();
        }
    }
}
