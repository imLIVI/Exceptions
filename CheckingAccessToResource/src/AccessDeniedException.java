public class AccessDeniedException extends Exception {

    public AccessDeniedException() {
        super("Пользователю должно быть больше 18 лет!");
    }
}
