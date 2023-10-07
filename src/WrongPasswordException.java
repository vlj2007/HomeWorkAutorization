public class WrongPasswordException extends RuntimeException {
    public WrongPasswordException(String password) {
        super(password);
    }
}
