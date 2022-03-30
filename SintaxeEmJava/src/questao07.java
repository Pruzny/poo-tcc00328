import java.text.DecimalFormat;
import java.util.Scanner;

public class questao07 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int total = 0, terribleNum = 0, badNum = 0, goodNum = 0, excellentNum = 0;

        System.out.println("Digite a nota:");
        int n = keyboard.nextInt();
        while (0 <= n & n <= 100) {
            total++;
            if (n <= 25)
                terribleNum++;
            else if (n <= 50)
                badNum++;
            else if (n <= 75)
                goodNum++;
            else
                excellentNum++;
            System.out.println("Digite a nota:");
            n = keyboard.nextInt();
        }

        double terriblePercentage = (double) 100*terribleNum/total;
        double badPercentage = (double) 100*badNum/total;
        double goodPercentage = (double) 100*goodNum/total;
        double excellentPercentage = 100 - terriblePercentage - badPercentage - goodPercentage;

        DecimalFormat format = new DecimalFormat("#0.##");
        System.out.println("Péssimo: " + format.format(terriblePercentage) + "%");
        System.out.println("Ruim: " + format.format(badPercentage) + "%");
        System.out.println("Bom: " + format.format(goodPercentage) + "%");
        System.out.println("Ótimo: " + format.format(excellentPercentage) + "%");
    }
}
