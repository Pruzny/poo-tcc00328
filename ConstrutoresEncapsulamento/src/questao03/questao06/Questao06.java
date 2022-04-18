package questao03.questao06;

public class Questao06 {
    public static void questao06() {
        Baralho baralho = new Baralho();
        System.out.println("Baralho gerado:");
        baralho.criarBaralho();
        baralho.mostrarBaralho();

        System.out.println("Baralho embaralhado:");
        baralho.embaralhar();
        baralho.mostrarBaralho();

        System.out.println("Baralho ordenado:");
        baralho.ordenar();
        baralho.mostrarBaralho();
    }
}
