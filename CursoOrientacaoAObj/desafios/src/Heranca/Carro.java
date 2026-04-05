package Heranca;

public class Carro {

    private String modelName;
    private Double averagePrice1;
    private Double averagePrice2;
    private Double averagePrice3;

    public String getModelName() {
        return modelName;
    }

    public void mostrarModelo(String modelo) {
        System.out.println("O modelo do carro é: " + modelo);
    }

    public void definirNomeModelo(String modelName) {
        this.modelName = modelName;
    }

    public void definirPreco(double averagePrice1, double averagePrice2, double averagePrice3) {
        this.averagePrice1 = averagePrice1;
        this.averagePrice2 = averagePrice2;
        this.averagePrice3 = averagePrice3;
    }

    public double maior() {
        double maior = 0.0;

        if (averagePrice1 > averagePrice2 && averagePrice1 > averagePrice3) {
            maior = averagePrice1;
        } else if (averagePrice2 > averagePrice1 && averagePrice2 > averagePrice3) {
            maior = averagePrice2;
        } else {
            maior = averagePrice3;
        }
        return maior;
    }

    public double menor() {
        double menor = 0.0;

        if (averagePrice1 < averagePrice2 && averagePrice1 < averagePrice3) {
            menor = averagePrice1;
        } else if (averagePrice2 < averagePrice1 && averagePrice2 < averagePrice3) {
            menor = averagePrice2;
        } else {
            menor = averagePrice3;
        }
        return menor;
    }

    public void exibirInfo() {
        System.out.println("Modelo do carro: " + modelName);
        System.out.println("Preço médio ano 1: " + averagePrice1);
        System.out.println("Preço médio ano 2: " + averagePrice2);
        System.out.println("Preço médio ano 3: " + averagePrice3);
        System.out.println("Maior preço: " + maior());
        System.out.println("Menor preço: " + menor());
    }
}
