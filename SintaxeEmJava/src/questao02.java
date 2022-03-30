import java.util.Scanner;

public class questao02 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Digite o valor de R:");
        double r = keyboard.nextDouble();
        System.out.println("Digite o valor de S:");
        double s = keyboard.nextDouble();
        System.out.println("Digite o valor de T:");
        double t = keyboard.nextDouble();
        
        if (r > s & r > t)
            System.out.println("O maior valor é o R");
        else if (s > t)
            System.out.println("O maior valor é o S");
        else
            System.out.println("O maior valor é o T");
    }
}
