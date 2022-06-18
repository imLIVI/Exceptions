public class User {
    private String login;
    private String password;
    private int age;
    private String email;

    public User(String login, String password, int age, String email) {
        this.login = login;
        this.password = password;
        this.age = age;
        this.email = email;
    }

    public String getLogin() {
        return this.login;
    }

    public String getPassword() {
        return this.password;
    }

    public int getAge() {
        return this.age;
    }
}
