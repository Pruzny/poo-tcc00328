package questao03;

import java.util.ArrayList;

public class Evento {
    private static final int MAXIMO_PALESTRAS = 20;
    private ArrayList<Palestra> palestras;
    private String titulo;
    private String dataInicio;    
    private String dataFim;
    private String horarioInicio;
    private String horarioFim;
    
    Evento(String titulo, String dataInicio, String dataFim, String horarioInicio, String horarioFim) {
        palestras = new ArrayList<>();
        this.titulo = titulo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
    }
    
    void addPalestra(Palestra novaPalestra) {
        if (getPalestras().size() < MAXIMO_PALESTRAS) {
            getPalestras().add(novaPalestra);
            System.out.println("Palestra adicionada!");
        } else {
            System.out.println("Impossivel criar palestra. Total atingido.");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }

    public String getHorarioFim() {
        return horarioFim;
    }

    public ArrayList<Palestra> getPalestras() {
        return palestras;
    }
}
