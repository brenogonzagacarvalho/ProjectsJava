package br.ufc.quixada.cc.model.sobrecarga;

public class Calculadora {
    public static int soma(int a, int b) {
        return a+b;
    }
    
    public static int soma(int a, int b, int c) {
        return a+b+c;
    }
}
