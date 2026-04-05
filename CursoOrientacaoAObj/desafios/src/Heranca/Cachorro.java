package Heranca;

public class Cachorro extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Au au au au!!!");
    }

    public void abanarRabo() {
        System.out.println("Abanando o rabo!!!");
    }
}