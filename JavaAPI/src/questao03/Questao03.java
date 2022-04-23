package questao03;

import java.util.Scanner;

public class Questao03 {
    public static void questao03() {
        Scanner teclado = new Scanner(System.in);
        Menu menu = new Menu();
        Agenda agenda = new Agenda();
        int op;
        do {
            menu.mostrarOpcoes();
            op = Integer.parseInt(teclado.next());
            menu.escolher(op, agenda);
        } while (op > 0);
    }
}
