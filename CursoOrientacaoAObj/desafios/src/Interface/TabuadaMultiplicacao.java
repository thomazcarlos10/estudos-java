package Interface;

public class TabuadaMultiplicacao implements Tabuada {

    private Integer number;

    public TabuadaMultiplicacao(Integer number) {
        this.number = number;
    }


    @Override
    public void mostrarTabuada() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " X " + i + " = " + number * i);
        }
    }
}