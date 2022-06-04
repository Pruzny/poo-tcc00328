package questao03;

public class Musica {
    private String nome;
    private String artista;

    public Musica(String nome, String artista) {
        this.nome = nome;
        this.artista = artista;
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", this.nome, this.artista);
    }

    public boolean equals(Musica outraMusica) {
        return this.nome.equalsIgnoreCase(outraMusica.nome) && this.artista.equalsIgnoreCase(outraMusica.artista);
    }
}
