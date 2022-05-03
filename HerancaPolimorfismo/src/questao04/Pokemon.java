package questao04;

import java.util.ArrayList;

public class Pokemon {
    private String nome;
    private double altura;
    private double peso;
    private String habilidade;
    private ArrayList<String> tipos;
    private int nivel;
    private int xp;
    private ArrayList<Ataque> ataques;
    private int hp;
    private int atk;
    private int def;
    private int spAtk;
    private int spDef;
    private int spd;

    public Pokemon(String nome, double altura, double peso, String habilidade, ArrayList<String> tipos, int nivel,
                   int xp, ArrayList<Ataque> ataques, int hp, int atk, int def, int spAtk, int spDef, int spd) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.habilidade = habilidade;
        this.tipos = tipos;
        this.nivel = nivel;
        this.xp = xp;
        this.ataques = ataques;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spAtk = spAtk;
        this.spDef = spDef;
        this.spd = spd;
    }

    public Pokemon(String nome, double altura, double peso, String habilidade, ArrayList<String> tipos, int nivel,
                   int xp, int hp, int atk, int def, int spAtk, int spDef, int spd) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.habilidade = habilidade;
        this.tipos = tipos;
        this.nivel = nivel;
        this.xp = xp;
        this.ataques = new ArrayList<>();
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spAtk = spAtk;
        this.spDef = spDef;
        this.spd = spd;
    }

    public Pokemon(String nome, double altura, double peso, ArrayList<String> tipos, int nivel,
                   int xp, ArrayList<Ataque> ataques, int hp, int atk, int def, int spAtk, int spDef, int spd) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.habilidade = null;
        this.tipos = tipos;
        this.nivel = nivel;
        this.xp = xp;
        this.ataques = ataques;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spAtk = spAtk;
        this.spDef = spDef;
        this.spd = spd;
    }

    public Pokemon(String nome, double altura, double peso, ArrayList<String> tipos, int nivel,
                   int xp, int hp, int atk, int def, int spAtk, int spDef, int spd) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.habilidade = null;
        this.tipos = tipos;
        this.nivel = nivel;
        this.xp = xp;
        this.ataques = new ArrayList<>();
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spAtk = spAtk;
        this.spDef = spDef;
        this.spd = spd;
    }

    public boolean hasHabilidade() {
        return habilidade != null;
    }

    void subirNivel() {
        nivel++;

        if (nivel == ListaEvolucoes.getNivel(nome)) {
            evoluir();
        }

        Atributos stats = ListaAtributos.getAtributos(nome);

        this.altura += stats.getAltura();
        this.peso += stats.getPeso();
        this.hp += stats.getHp();
        this.atk += stats.getAtk();
        this.def += stats.getDef();
        this.spAtk += stats.getSpAtk();
        this.spDef += stats.getSpDef();
        this.spd += stats.getSpd();
    }

    void evoluir () {
        nome = ListaEvolucoes.getEvolucao(nome);
    }

    public String getNome() {
        return nome;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public ArrayList<String> getTipos() {
        return tipos;
    }

    public int getNivel() {
        return nivel;
    }

    public ArrayList<Ataque> getAtaques() {
        return ataques;
    }

    public int getHp() {
        return hp;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public int getSpAtk() {
        return spAtk;
    }

    public int getSpDef() {
        return spDef;
    }

    public int getSpd() {
        return spd;
    }

    @Override
    public String toString() {
        String tipos = "";
        for (String texto: this.tipos) {
            tipos += texto + " ";
        }
        tipos = tipos.strip();

        String ataques = "";
        for (Ataque ataque: this.ataques) {
            ataques += ataque.getNome() + " / ";
        }
        ataques = ataques.substring(0, ataques.length()-2);
        return String.format("" +
                "Pokemon: %s\n" +
                "Altura: %.2f m\n" +
                "Peso: %.2f kg\n" +
                "Habilidade: %s\n" +
                "Tipos: %s\n" +
                "Nivel: %d\n" +
                "Ataques: %s\n" +
                "HP: %d\n" +
                "Ataque: %d\n" +
                "Defesa: %d\n" +
                "Ataque Especial: %d\n" +
                "Defesa Especial: %d\n" +
                "Velocidade: %d\n",
                nome, altura, peso, habilidade, tipos, nivel, ataques, hp, atk, def, spAtk, spDef, spd
        );
    }
}
