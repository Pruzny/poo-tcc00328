package questao03;

public class ClienteInexistenteException extends RuntimeException {
    ClienteInexistenteException() {
        super("Cliente nao esta na lista");
    }
}
