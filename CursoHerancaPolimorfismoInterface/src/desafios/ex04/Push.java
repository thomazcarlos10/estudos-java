package desafios.ex04;

public class Push extends Notification {
    private String title;

    public Push(String recipient, String message, String title) {
        super(recipient, message);
        this.title = title;
    }

    @Override
    public void send() {
        System.out.printf("\nEnviando Push para: %s\nTítulo: %s!\nConteúdo: %s.\n",
                recipient, title, message);
    }
}