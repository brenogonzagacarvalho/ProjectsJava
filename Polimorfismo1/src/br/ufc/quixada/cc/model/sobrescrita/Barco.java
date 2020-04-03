package br.ufc.quixada.cc.model.sobrescrita;

public class Barco extends Brinquedo {
    
    @Override
    public void mover() {
        System.out.println("O barco está se movendo.");
    }
}
