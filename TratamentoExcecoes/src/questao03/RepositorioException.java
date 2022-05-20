package questao03;

public class RepositorioException extends RuntimeException {
    RepositorioException() {
        super("Lista esta cheia");
    }
}
