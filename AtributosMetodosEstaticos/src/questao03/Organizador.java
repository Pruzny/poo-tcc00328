package questao03;

import questao03.ic.*;
import java.util.Scanner;

public class Organizador {
    public static void montarEvento() {
        Evento semanaComp = new Evento(
                "Semana da Computacao",
                "25/04/2022",
                "26/04/2022",
                "11:00",
                "19:00"
        );
        
        Palestra poo = new Palestra(
                "Orientacao a Objetos",
                new Participante((Professor) ListaMembros.membros.get(3)),
                "IC/UFF",
                "25/04/2022",
                "13:00"
        );
        for (int i=0; i<3; i++) {
            Participante participante = new Participante((Aluno) ListaMembros.membros.get(i));
            poo.addParticipante(participante);
        }
        semanaComp.addPalestra(poo);

        imprimirEvento(semanaComp);
    }

    public static void imprimirEvento(Evento evento) {
        System.out.printf("Evento: %s\n", evento.getTitulo());
        System.out.printf("Inicio: %s %s\n", evento.getDataInicio(), evento.getHorarioInicio());
        System.out.printf("Fim: %s %s\n\n", evento.getDataFim(), evento.getHorarioFim());
        for (Palestra palestra: evento.getPalestras()) {
            imprimirPalestra(palestra);
        }
    }

    public static void imprimirPalestra(Palestra palestra) {
        System.out.printf("Palestra: %s\n", palestra.getTitulo());
        System.out.printf("Apresentador(a): %s\n", palestra.getPalestrante().getNome());
        System.out.printf("Data: %s %s\n", palestra.getData(), palestra.getHorario());
        System.out.printf("Local: %s\n", palestra.getLocal());
        System.out.println("Participantes:");
        for (Participante participante: palestra.getParticipantes()) {
            System.out.printf("- %s\n", participante.getNome());
        }

    }
}
