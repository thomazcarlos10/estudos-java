package Interface;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    private Double width;
    private Double height;

    public CalculadoraSalaRetangular(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcularArea() {
        return width * height;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (width + height);
    }
}