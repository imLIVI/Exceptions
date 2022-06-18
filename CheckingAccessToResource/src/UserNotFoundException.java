public class UserNotFoundException extends Exception {

    public UserNotFoundException() {
        super("Не найден пользователь с таким логином и паролем!");
    }
}
