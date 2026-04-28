package ex04;

public class TemperatureControl {
    public String local;
    public Double currentTemperature;

    public void displayInfo() {
        System.out.printf("Sonsor no local: %s\nTemperatura: %.1f ºC\n", local, currentTemperature);

        if (currentTemperature > 37.5) {
            System.out.println("Alerta: Temperatura acima do limite!");
        }
    }
}
