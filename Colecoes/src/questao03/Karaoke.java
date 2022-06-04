package questao03;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Karaoke {
    private Queue<Musica> musicas;

    public Karaoke() {
        this.musicas = new LinkedBlockingQueue<>();
    }

    public void tocar() {
        Musica musica = musicas.poll();
        if (musica != null) {
            System.out.printf("Tocando: %s\n", musica);
        } else {
            System.out.println("Sem musicas na lista");
        }
    }

    public void adicionarMusica(Musica musica) {
        if (musicas.contains(musica)) {
            System.out.println("Musica ja esta na lista");
        } else {
            musicas.add(musica);
            System.out.println("Musica adicionada!");
        }
    }

    public void adicionarMusica(String nome, String artista) {
        Musica musica = new Musica(nome, artista);
        if (musicas.contains(musica)) {
            System.out.println("Musica ja esta na lista");
        } else {
            musicas.offer(musica);
            System.out.println("Musica adicionada!");
        }
    }

    public void mostrarLista() {
        int i = 1;
        for (Musica musica: musicas) {
            System.out.printf("[%d] - %s\n", i, musica);
            i++;
        }
        if (i == 1) {
            System.out.println("Sem musicas na fila");
        }
    }
}
