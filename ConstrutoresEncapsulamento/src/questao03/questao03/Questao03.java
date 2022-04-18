package questao03.questao03;

public class Questao03 {
    public static void questao03() {
        Porta porta = new Porta("marrom", 0.8, 2, 0.1);
        mostrarPorta(porta);
        porta.mudarTamanho();
        porta.mexer();
        mostrarPorta(porta);
        porta.pintar();
        mostrarPorta(porta);
        porta.mexer();
        mostrarPorta(porta);
    }
    
    static void mostrarPorta(Porta p) {
        String estado;
        if (p.estaAberta())
            estado = "aberta";
        else
            estado = "fechada";
        System.out.printf("A porta de cor %s e dimensões L=%.2f A=%.2f P=%.2f está "
                + "%s.\n", p.getCor(), p.getLargura(), p.getAltura(), p.getProfundidade(), estado);
    }
}
