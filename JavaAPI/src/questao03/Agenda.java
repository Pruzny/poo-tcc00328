package questao03;

import java.util.Calendar;
import java.util.ArrayList;

public class Agenda {
    private ArrayList<Compromisso> compromissos = new ArrayList<>();

    void addCompromisso(String titulo, String descricao, String local, Calendar data) {
        Compromisso compromisso = new Compromisso(titulo, descricao, local, data);
        compromissos.add(compromisso);
    }

    ArrayList<Compromisso> verificarDia(int dia, int mes, int ano) {
        ArrayList<Compromisso> horarios = new ArrayList<>();
        for (Compromisso compromisso: compromissos) {
            Calendar data = compromisso.getData();
            if (data.get(Calendar.DAY_OF_MONTH) == dia && data.get(Calendar.MONTH) == mes && data.get(Calendar.YEAR) == ano) {
                horarios.add(compromisso);
            }
        }

        horarios.sort(new ComparadorData(0));
        horarios.sort(new ComparadorData(1));

        return horarios;
    }
}
