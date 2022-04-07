public class Bateria {
    int capacidadeCarga = 100;
    int nivelCarga = 100;
    int porcentagem = 100;

    void usar(int uso) {
        nivelCarga -= uso;
        porcentagem = (int) ((float) nivelCarga/capacidadeCarga * 100);
    }

    void recarregar(int carga) {
        if (porcentagem + carga > 100) {
            porcentagem = 100;
        } else {
            porcentagem += carga;
        }
        nivelCarga = (int) ((float) capacidadeCarga * porcentagem/100);
    }
}
