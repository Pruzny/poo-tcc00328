public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        for (int i=0; i<3; i++) {
            agenda.criarContato();
        }
        agenda.mostrarAgenda();
    }
}
