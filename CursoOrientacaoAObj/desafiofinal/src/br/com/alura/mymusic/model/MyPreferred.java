package br.com.alura.mymusic.model;

public class MyPreferred {

    public void include(Audio a) {
       if (a.getClassification() >= 9) {
           System.out.println(a.getTitle() + " é considerado sucesso absoluto e preferido por todos!");
       } else {
           System.out.println(a.getTitle() + " é uma excelente opção para deixar na lista do que deve escutar!");
       }
    }
}