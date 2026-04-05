package Heranca;

public class Gato extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Miau miau miau!!!");
    }

    public void arranharMoveis() {
        System.out.println("Arranhando os moveis!!!");
    }
}