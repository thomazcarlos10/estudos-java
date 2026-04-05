package Heranca;

public class ContaBancaria {

    protected Double saldo = 0.0;

    public void depositar(double valor) {
        System.out.println("Depositando R$" + valor);
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            System.out.println("Sacando R$" + valor);
            saldo -= valor;
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }
}