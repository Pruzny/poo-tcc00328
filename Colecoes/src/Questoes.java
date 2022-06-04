import questao01.Contador;
import questao02.Conversor;
import questao03.Programa;

public class Questoes {
    public static void questao(int num) {
        switch (num) {
            case 1:
                Contador.contar();
                break;
            case 2:
                /*
                    Embora a ordem dos elementos tenha continuado a mesma, algumas interfaces como HashMap não
                    possuem ordem definida e podem variar ao longo da execução do programa, pois nelas não há
                    o conceito e nem necessidade de ordem estabelecida (caso necessário, também há interfaces
                    que implementam ordem, como a LinkedHashMap).
                 */
                Conversor.converter();
                break;
            case 3:
                Programa.executar();
                break;
        }
    }
}
