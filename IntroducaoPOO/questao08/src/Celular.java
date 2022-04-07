public class Celular {
    Bateria bateria = new Bateria();

    void ligar(int tempo) {
        bateria.usar(tempo/5);
    }

    void mensagem() {
        bateria.usar(1);
    }

    void mostrarCarga() {
        System.out.printf("BATERIA = [%02d%%]\n", bateria.porcentagem);
    }
}
