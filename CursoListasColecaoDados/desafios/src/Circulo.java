import interfaces.Forma;

public class Circulo implements Forma {
    @Override
    public double calcularArea(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }
}