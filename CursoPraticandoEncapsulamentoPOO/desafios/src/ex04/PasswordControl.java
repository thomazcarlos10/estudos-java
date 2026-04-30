package ex04;

public class PasswordControl {
    private String password;

    public PasswordControl(String password) {
        this.password = password;
    }

    public void changePassword(String password, String newPassword) {
        if (password.equals(this.password)) {
            this.password = newPassword;
            System.out.println("Senha alterada com sucesso!");
        } else {
            System.out.println("Senha atual incorreta. A senha não foi alterada.");
        }
    }
}