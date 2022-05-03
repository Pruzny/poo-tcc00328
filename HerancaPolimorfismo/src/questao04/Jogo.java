package questao04;

import java.util.ArrayList;
import java.util.List;

public class Jogo {
    public static void jogar() {
        Pokemon meuPokemon = new Pokemon(
                "Pikachu",
                0.4,
                6,
                "Estatico",
                new ArrayList<String>(List.of("Eletrico")),
                6,
                0,
                new ArrayList<Ataque>(List.of(new Ataque("Choque do Trovao", "Eletrico", 0.9, 40, 30))),
                21,
                13,
                9,
                11,
                10,
                17
        );
        System.out.println(meuPokemon);
    }
}
