package desafios.ex04;

public class Email extends Notification {
    private String subject;

    public Email(String recipient, String message, String subject) {
        super(recipient, message);
        this.subject = subject;
    }

    @Override
    public void send() {
        System.out.printf("\nEnviando Email para: %s\nAssunto: %s!\nCorpo: %s.\n",
                recipient, subject, message);
    }
}