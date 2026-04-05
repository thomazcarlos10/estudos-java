package Heranca;

public class VerificadorPrimo extends NumerosPrimos {

    public void verificarSeEhPrimo(int number) {
        if (verificarPrimalidade(number)) {
            System.out.println("O número " + number + " é primo");
        } else {
            System.out.println("O número " + number + " não é primo");
        }
    }
}