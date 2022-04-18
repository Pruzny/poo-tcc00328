package questao03.questao06;

public class Baralho {
    Carta[] cartas = new Carta[52];
    
    void criarBaralho() {
        for (int i=0; i<4; i++) {
            for (int j=1; j<14; j++) {
                Carta carta = new Carta(j, i);
                cartas[13*i + j-1] = carta;
            }
        }
    }

    public void embaralhar() {
        Carta[] novaLista = new Carta[52];
        int i;
        for (i=0; i<52; i++)
            novaLista[i] = null;
        i = 0;
        while (i<52) {
            int num = (int) (Math.random() * 52);
            if (novaLista[num] == null) {
                novaLista[num] = cartas[i];
                i++;
            }
        }
        cartas = novaLista;
    }

    public void ordenar() {
        for (int i=0; i<51; i++) {
            for (int j=i+1; j<52; j++) {
                if (cartas[i].getId() > cartas[j].getId()) {
                    Carta aux = cartas[i];
                    cartas[i] = cartas[j];
                    cartas[j] = aux;
                }
            }
        }
    }
    
    public void mostrarBaralho() {
        for (int i=0; i<52; i++) {
            cartas[i].mostrarCarta();
        }
    }
}
