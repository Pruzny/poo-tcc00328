import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Questao: ");
        Questoes.questao(Integer.parseInt(teclado.nextLine()));
    }
}
