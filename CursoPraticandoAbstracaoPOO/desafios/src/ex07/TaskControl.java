package ex07;

public class TaskControl {
    public String description;
    public Boolean completed;

    public void displayInfo() {
        if (!completed) {
            System.out.printf("Tarefa: %s - Status: Pendente\n", description);
        } else {
            System.out.printf("Tarefa: %s - Status: Concluída\n", description);
        }
    }
}
