package br.ufc.quixada.cc.model.sobrescrita;

public class Carro extends Brinquedo {
    
    @Override
    public void mover() {
        System.out.println("O carro está se movendo.");
    }
}
