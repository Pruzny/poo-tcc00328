import java.util.Scanner;

public class questao08 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int i, j, aux, defaultSum = 0;
        boolean isMagic = true;
        int[][] magicSquare = new int[4][4];

        // input
        for (i =0; i<4; i++)
            for (j=0; j<4; j++) {
                System.out.println("a_[" + (i+1) + "-" + (j+1) + "]:");
                magicSquare[i][j] = keyboard.nextInt();
            }

        // valor da soma
        for (i=0; i<4; i++)
            defaultSum += magicSquare[i][0];

        // linhas
        for (i=1; i<4; i++) {
            aux = 0;
            for (j=0; j<4; j++) {
                aux += magicSquare[i][j];
            }
            if (aux != defaultSum)
                isMagic = false;
        }

        // colunas
        for (j=0; j<4; j++) {
            aux = 0;
            for (i=0; i<4; i++) {
                aux += magicSquare[i][j];
            }
            if (aux != defaultSum)
                isMagic = false;
        }

        // diagonal principal
        aux = 0;
        for (i=0; i<4; i++)
            aux += magicSquare[i][i];
        if (aux != defaultSum)
            isMagic = false;

        // diagonal secundária
        aux = 0;
        for (i=0; i<4; i++)
            aux += magicSquare[i][3-i];
        if (aux != defaultSum)
            isMagic = false;

        // resultado
        if (isMagic)
            System.out.println("A matriz é um quadrado mágico!");
        else
            System.out.println("A matriz NÃO é um quadrado mágico");
    }
}
