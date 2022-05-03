package questao04;

import java.util.ArrayList;

public class Atributos {
    private final String nome;
    private final double altura;
    private final double peso;
    private final int hp;
    private final int atk;
    private final int def;
    private final int spAtk;
    private final int spDef;
    private final int spd;

    Atributos(String nome, double altura, double peso, int hp, int atk, int def, int spAtk, int spDef, int spd) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spAtk = spAtk;
        this.spDef = spDef;
        this.spd = spd;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getNome() {
        return nome;
    }

    public double getHp() {
        return hp;
    }

    public double getAtk() {
        return atk;
    }

    public double getDef() {
        return def;
    }

    public double getSpAtk() {
        return spAtk;
    }

    public double getSpDef() {
        return spDef;
    }

    public double getSpd() {
        return spd;
    }
}
