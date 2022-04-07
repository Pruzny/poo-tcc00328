public class Baralho {
    Carta[] cartas = new Carta[52];
    
    void criarBaralho() {
        for (int i=0; i<4; i++) {
            for (int j=1; j<14; j++) {
                Carta carta = new Carta();
                carta.inserirDados(j, i);
                cartas[13*i + j-1] = carta;
            }
        }
    }
    
    void mostrarBaralho() {
        for (int i=0; i<52; i++) {
            cartas[i].mostrarCarta();
        }
    }
}
