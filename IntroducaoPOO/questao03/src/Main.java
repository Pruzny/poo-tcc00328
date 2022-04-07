public class Main {
    public static void main(String[] args) {
        Porta porta = new Porta();
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
        if (p.aberta)
            estado = "aberta";
        else
            estado = "fechada";
        System.out.printf("A porta de cor %s e dimensões L=%.2f A=%.2f P=%.2f está "
                + "%s.\n", p.cor, p.largura, p.altura, p.profundidade, estado);
    }
}
