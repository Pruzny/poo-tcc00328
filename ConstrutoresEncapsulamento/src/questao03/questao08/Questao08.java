package questao03.questao08;

public class Questao08 {
    public static void questao08() {
        Celular tijolao = new Celular();
        for (int i=0; i<5; i++) {
            System.out.println("Ligando...");
            tijolao.ligar(20);
            tijolao.mostrarCarga();
        }
        for (int i=0; i<5; i++) {
            System.out.println("Enviando mensagem...");
            tijolao.mensagem();
            tijolao.mostrarCarga();
        }
        System.out.println("Recarregando...");
        tijolao.entradaUsb(20);
        tijolao.mostrarCarga();
        System.out.println("Telefone desligado.");
    }
}
