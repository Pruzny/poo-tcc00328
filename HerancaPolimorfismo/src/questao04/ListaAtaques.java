package questao04;
import java.util.ArrayList;

public class ListaAtaques {
    private static ArrayList<Ataque> lista = new ArrayList<>();

    public static Ataque procurarAtaque(String nome) {
        for (Ataque ataque: lista) {
            if (ataque.getNome().equalsIgnoreCase(nome)) {
                return ataque;
            }
        }
        return null;
    }
}
