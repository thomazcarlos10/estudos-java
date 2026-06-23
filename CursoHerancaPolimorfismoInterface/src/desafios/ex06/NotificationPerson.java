package desafios.ex06;

public class NotificationPerson {
    public void sendMessage(String message) {
        System.out.println("\nMensagem enviada para todos: " + message);
    }

    public void sendMessage(String name, String message) {
        System.out.println("Mensagem para " + name + ": " + message);
    }

    public void sendMessage(String name, String message, Integer quantity) {
        for (int i = 0; i < quantity; i++) {
            System.out.println("Mensagem para " + name + ": " + message);
        }
    }
}