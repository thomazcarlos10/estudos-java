package desafios.ex10;

public class AirConditioning implements Controllable {
    private boolean on = false;

    @Override
    public void call() {
        if (!on) {
            System.out.println("Ar-condicionado ligado.");
            on = true;
        } else {
            System.out.println("Ar-condicionado já está ligado.");
        }
    }

    @Override
    public void turnOff() {
        if (on) {
            System.out.println("Ar-condicionado desligado.");
            on = false;
        } else {
            System.out.println("Ar-condicionado já esta desligado.");
        }
    }
}
