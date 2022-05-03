package questao04;

import java.util.HashMap;

public class ListaEvolucoes {
    private static HashMap<String, Integer> niveis = new HashMap<>();
    private static HashMap<String, String> evolucoes = new HashMap<>();

    public static String getEvolucao(String pokemon) {
        return evolucoes.get(pokemon);
    }

    public static int getNivel(String pokemon) {
        return niveis.get(pokemon);
    }
 }
