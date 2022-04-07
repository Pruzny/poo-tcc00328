public class Main {
    public static void main(String[] args) {
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
        System.out.println("Telefone desligado.");
    }
}
