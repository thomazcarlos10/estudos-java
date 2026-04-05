package Interface;

public class ConversorMoeda implements ConversaoFinanceira {

    private Double dollarValue;
    private Double valueInDollar;

    public ConversorMoeda(Double dollarValue, Double valueInDollar) {
        this.dollarValue = dollarValue;
        this.valueInDollar = valueInDollar;
    }

    @Override
    public double converterDolarParaReal() {
        return dollarValue * valueInDollar;
    }
}