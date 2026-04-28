package ex06;

public class CorrectingRegistration {
    public String name;
    public String position;
    public Integer accessLevel;

    public void updateData(String newPosition, int newLevel) {
        System.out.println("--- Antes da atualização ---");
        System.out.printf("Nome: %s\nCargo atual: %s\nNível de acesso: %d\n", name, position, accessLevel);

        position = newPosition;
        accessLevel = newLevel;

        System.out.println("\n--- Após atualização ---");
        System.out.printf("Nome: %s\nCargo atual: %s\nNível de acesso: %d\n", name, position, accessLevel);
    }
}
