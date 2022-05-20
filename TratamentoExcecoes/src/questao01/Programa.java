package questao01;

public class Programa {
    public static void executar() {
        try {
            int num = -1;
            System.out.println(ehPar(num));
        }
        catch (NumberFormatException ex) {
            System.out.println("String invalida");
        }
        catch (IllegalArgumentException ex) {
            System.out.println("Argumento invalido");
        }
    }

    public static boolean ehPar(int num) {
        if (num < 0) {
            throw new IllegalArgumentException();
        }
        return num % 2 == 0;
    }
}
