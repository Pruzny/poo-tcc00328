package questao03;

public class Programa {
    public static void executar() {
        Karaoke karaoke = new Karaoke();

        karaoke.adicionarMusica("Titanium", "David Guetta");
        karaoke.adicionarMusica("Fumes", "Eden");
        karaoke.adicionarMusica("Hino do Vasco", "Lamartine Babo");

        karaoke.mostrarLista();
        karaoke.tocar();
        karaoke.mostrarLista();
        karaoke.tocar();
        karaoke.tocar();
        karaoke.mostrarLista();
    }
}
