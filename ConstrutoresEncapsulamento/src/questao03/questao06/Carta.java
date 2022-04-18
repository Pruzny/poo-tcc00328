package questao03.questao06;

public class Carta {
    private int id;
    private int valor;
    private String nome;
    private String naipe;
    
    Carta(int num, int tipo) {
        id = tipo*12 + num;
        valor = num;
        switch (num) {
            case 1:
                nome = "Ás";
                break;
            case 11:
                nome = "Valete";
                break;
            case 12:
                nome = "Dama";
                break;
            case 13:
                nome = "Rei";
                break;
            default:
                nome = "" + num;
        }
        switch (tipo) {
            case 0:
                naipe = "Copas";
                break;
            case 1:
                naipe = "Espadas";
                break;
            case 2:
                naipe = "Ouros";
                break;
            case 3:
                naipe = "Paus";
        }
    }
    
    public void mostrarCarta() {
        System.out.printf("%s de %s.\n", nome, naipe);
    }

    public int getId() {
        return id;
    }
}
