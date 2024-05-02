public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException() {
        super("Parâmetros inválidos");
    }

    public ParametrosInvalidosException(String message) {
        super(message);
    }
}
