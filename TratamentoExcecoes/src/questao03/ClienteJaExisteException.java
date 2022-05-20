package questao03;

public class ClienteJaExisteException extends RuntimeException {
    ClienteJaExisteException() {
        super("Cliente ja esta na lista");
    }
}
