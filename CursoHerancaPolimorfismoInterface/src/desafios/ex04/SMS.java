package desafios.ex04;

public class SMS extends Notification {

    public SMS(String recipient, String message) {
        super(recipient, message);
    }

    @Override
    public void send() {
        System.out.printf("\nEnviando SMS para: %s\nMensagem: %s.\n",
                recipient, message);
    }
}