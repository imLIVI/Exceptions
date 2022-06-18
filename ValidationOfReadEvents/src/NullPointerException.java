public class NullPointerException extends RuntimeException {
    public NullPointerException(Class title) {
        super("Cобытие из " + title + " содержит поля со значением null или 0");
    }
}
