import interfaces.Forma;

public class Quadrado implements Forma {
    @Override
    public double calcularArea(double largura) {
        return Math.pow(largura, 2);
    }
}
