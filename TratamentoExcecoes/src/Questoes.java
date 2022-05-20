import questao02.TesteContaCorrente;

public class Questoes {
    public static void questao(int num) {
        switch (num) {
            case 0:
                Aula.aula();
                break;
            case 1:
                // IllegalArgumentException: o método recebeu algum argumento inválido, por exemplo número fora de um intervalo específico
                // NumberFormatException: ocorre quando é tentado converter uma string inválida para um número (filha de IllegalArgumentException)
                questao01.Programa.executar();
                break;
            case 2:
                TesteContaCorrente.testar();
                break;
            case 3:
                questao03.Programa.executar();
        }
    }
}
