package br.ufc.quixada.cc.model.sobrescrita;

public class Aviao extends Brinquedo {
    
    @Override
    public void mover() {
        System.out.println("O avião está se movendo.");
    }
}
