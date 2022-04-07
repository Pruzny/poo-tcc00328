public class Carta {
    int valor;
    String nome;
    String naipe;
    
    void inserirDados(int num, int tipo) {
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
    
    void mostrarCarta() {
        System.out.printf("%s de %s.\n", nome, naipe);
    }
}
