package Interface;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {

    private Integer temperatura;

    public ConversorTemperaturaPadrao(Integer temperatura) {
        this.temperatura = temperatura;
    }

    public Integer getTemperatura() {
        return temperatura;
    }

    @Override
    public int celsiusParaFahrenheit() {
        return (temperatura * 9 / 5) + 32;
    }

    @Override
    public int fahrenheitParaCelsius() {
        return (temperatura - 32) * 5 / 9;
    }
}