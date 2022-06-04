package questao01;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Contador {
    private static final Scanner teclado = new Scanner(System.in);

    public static void contar() {
        System.out.println("Digite a frase:");
        String frase = teclado.nextLine();

        Map<String, Integer> tabela = new HashMap<>();
        String[] palavras = frase.toLowerCase().split(" ");
        for (String palavra: palavras) {
            if (tabela.containsKey(palavra)) {
                tabela.replace(palavra, tabela.get(palavra) + 1);
            } else {
                tabela.put(palavra, 1);
            }
        }

        for (String palavra: tabela.keySet()) {
            System.out.printf("%d: %s\n", tabela.get(palavra), palavra);
        }
    }
}
