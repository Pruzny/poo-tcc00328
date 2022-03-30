import java.util.Scanner;

public class questao01 {
    public static void main(String[] args) {
        double n;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de números:");
        int total = keyboard.nextInt();
        
        int negatives = 0;
        for (int i=0; i<total; i++) {
            System.out.println("Número [" + (i+1) + "]:");
            n = keyboard.nextDouble();
            if (n < 0)
                negatives++;
        }
        
        System.out.println("A quantidade de números negativos é " + negatives);
    }
    
}
