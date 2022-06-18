import java.util.Scanner;

public class Main {
    public static final User[] USERS = {
            new User("AnnaHiltz", "qwerty123", 17, "anna@gmail.com"),
            new User("JavaLog", "asdfg456", 36, "javaLog@gmail.com"),
            new User("autor26", "zxcvb789", 28, "autor26@gmail.com"),
            new User("hope_", "43idjd12", 14, "hope@gmail.com"),
            new User("belika99", "dfd4df", 29, "belika@gmail.com")
    };

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Введите логин: ");
            String login = input.next();
            System.out.print("Введите пароль: ");
            String password = input.next();

            for (int i = 0; i < USERS.length; i++) {
                // Проверка доступа
                if (checkUserAccess(USERS[i], login, password)) {
                    //Доступ разрешен
                    //Проверка возраста
                    if (USERS[i].getAge() < 18) {
                        throw new AccessDeniedException();
                    } else {
                        System.out.println("Доcтуп предоставлен!");
                        break;
                    }
                }
                if (i == USERS.length - 1) {
                    throw new UserNotFoundException();
                }

            }
        } catch (UserNotFoundException | AccessDeniedException e) {
            e.printStackTrace();
        }
    }

    public static boolean checkUserAccess(User user, String login, String password) {
        if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
            return true;
        }
        return false;
    }
}
