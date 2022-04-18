package questao03.questao08;

public class Celular {
    private Bateria bateria = new Bateria();

    public void ligar(int tempo) {
        bateria.usar(tempo/5);
    }

    public void mensagem() {
        bateria.usar(1);
    }

    public void mostrarCarga() {
        System.out.printf("BATERIA = [%02d%%]\n", bateria.getPorcentagem());
    }

    public void entradaUsb(int tempo) {
        bateria.recarregar(tempo * 2);
    }
}
