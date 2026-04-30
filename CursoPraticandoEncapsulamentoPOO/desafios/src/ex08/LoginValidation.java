package ex08;

public class LoginValidation {
    private String login;
    private String password;

    public LoginValidation(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public boolean validatePassword(String login, String password) {
        return this.login.equals(login) && this.password.equals(password);
    }
}