package questao03.questao01;

public class Questao01 {
    public static void questao01() {
        Agenda agenda = new Agenda();
        for (int i=0; i<3; i++) {
            agenda.criarContato();
        }
        agenda.mostrarAgenda();
    }
}
