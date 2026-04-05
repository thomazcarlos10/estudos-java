public class Carro {

    String modelo;
    int ano;
    String cor;

    void fichaTecnica() {
        System.out.println("Modelo: " + modelo
                + "\nAno do carro: " + ano
                + "\nCor: " + cor);
    }

    int calcularIdade(int anoAtual) {
        return anoAtual - ano;
    }
}