package exception;

public class UserAlreadyExistsEception extends RuntimeException {
    public UserAlreadyExistsEception(String message) {
        super(message);
    }
}
