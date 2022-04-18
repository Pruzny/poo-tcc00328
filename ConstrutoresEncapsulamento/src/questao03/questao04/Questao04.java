package questao03.questao04;

public class Questao04 {
    public static void questao04() {
        Casa lar = new Casa("branca", 3);
        lar.mudarCor();
        lar.criarPortas();
        lar.quantasPortasEstaoAbertas();
        System.out.println("Abrindo algumas portas...");
        lar.mexer(0);
        lar.mexer(2);
        lar.quantasPortasEstaoAbertas();
    }
}
