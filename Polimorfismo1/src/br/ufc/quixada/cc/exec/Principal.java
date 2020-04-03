package br.ufc.quixada.cc.exec;

import br.ufc.quixada.cc.model.sobrescrita.Brinquedo;
import br.ufc.quixada.cc.model.sobrescrita.Aviao;
import br.ufc.quixada.cc.model.sobrescrita.Carro;

public class Principal {
    public static void main(String[] args) {
        /*Aluno a1 = new Aluno();
        Aluno a2 = new Aluno("Julinho");
        Aluno a3 = new Aluno("Rogerinho", "UFCA");
        Aluno a4 = new Aluno("Maurilio", "UFMG", 30);*/
        
        Brinquedo b = new Brinquedo();
        b.mover();
        
        Aviao a = new Aviao();
        a.mover(); 
        
        Carro c = new Carro();
        c.mover();
        
        Brinquedo bc = new Carro();
        bc.mover();
    }
}
