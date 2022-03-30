import java.util.Scanner;

public class questao05 {
    public static void main(String[] args) {
        int fatorial = 1;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        double n = keyboard.nextDouble();
        
        if (n<0 || n%1 != 0) {
            System.out.println("Número inválido");
            System.out.println(-1);
        } else {
            for (int i=1; i<=n; i++) {
                fatorial *= i;
            }
            System.out.println(n + "! é igual a " + fatorial);
        }
    }
}
