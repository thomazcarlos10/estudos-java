package Heranca;

public class ContaCorrente extends ContaBancaria {

    private Double tarifaMensal;

    public void setTarifaMensal(Double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    public void cobrarTarifaMensal() {
        saldo -= tarifaMensal;
        System.out.println("Descontando tarifa mensal de R$" + tarifaMensal);
    }
}