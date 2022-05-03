package questao04;

import java.util.HashMap;

public class ListaAtributos {
    private static HashMap<String, Atributos> atributos = new HashMap<>();

    public static Atributos getAtributos(String pokemon) {
        return atributos.get(pokemon);
    }
}
