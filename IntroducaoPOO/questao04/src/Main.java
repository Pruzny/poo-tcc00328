public class Main {
    public static void main(String[] args) {
        Casa lar = new Casa();
        lar.mudarCor();
        lar.criarPortas();
        lar.quantasPortasEstaoAbertas();
        System.out.println("Abrindo algumas portas...");
        lar.portas[0].mexer();
        lar.portas[2].mexer();
        lar.quantasPortasEstaoAbertas();
    }
}
