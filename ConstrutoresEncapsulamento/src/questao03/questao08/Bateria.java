package questao03.questao08;

public class Bateria {
    private int capacidadeCarga = 100;
    private int nivelCarga = 100;
    private int porcentagem = 100;

    public void usar(int uso) {
        nivelCarga -= uso;
        porcentagem = (int) ((float) nivelCarga/capacidadeCarga * 100);
    }

    public void recarregar(int carga) {
        if (porcentagem + carga > 100) {
            porcentagem = 100;
        } else {
            porcentagem += carga;
        }
        nivelCarga = (int) ((float) capacidadeCarga * porcentagem/100);
    }

    public int getPorcentagem() {
        return porcentagem;
    }
}
