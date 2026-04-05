public class ContaBancaria {

    private Integer number;
    private Double saldo;

    public ContaBancaria(Integer number, Double saldo) {
        this.number = number;
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Integer getNumber() {
        return number;
    }
}