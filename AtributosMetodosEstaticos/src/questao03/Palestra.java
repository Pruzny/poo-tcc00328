package questao03;

import java.util.ArrayList;

public class Palestra {
    private static final int MAXIMO_PARTICIPANTES = 10;
    private String titulo;
    private Participante palestrante;
    private ArrayList<Participante> participantes;
    private String local;
    private String data;
    private String horario;
    
    public Palestra(String titulo, Participante palestrante, String local, String data, String horario) {
        this.titulo = titulo;
        this.palestrante = palestrante;
        this.participantes = new ArrayList<>();
        this.local = local;
        this.data = data;
        this.horario = horario;
    }
    
    public void addParticipante(Participante novoParticipante) {
        if (participantes.size() < MAXIMO_PARTICIPANTES) {
            participantes.add(novoParticipante);
            System.out.println("Participante adicionado!");
        } else {
            System.out.println("A palestra esta cheia. Participante nao adicionado.");
        }
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public Participante getPalestrante() {
        return palestrante;
    }
    
    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }
    
    public String getLocal() {
        return local;
    }
    
    public String getData() {
        return data;
    }
    
    public String getHorario() {
        return horario;
    }
}
