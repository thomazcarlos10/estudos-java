package desafios.ex10;

public class Light implements Controllable {
    private boolean on = false;

    @Override
    public void call() {
        if (!on) {
            System.out.println("Luz ligada.");
            on = true;
        } else {
            System.out.println("Luz já está ligada.");
        }
    }

    @Override
    public void turnOff() {
        if (on) {
            System.out.println("Luz desligada.");
            on = false;
        } else {
            System.out.println("Luz já esta desligada.");
        }
    }
}
