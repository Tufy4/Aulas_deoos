package aulas.genericos;

import aulas.colecoes.Pessoa;

public class ExemploPilha {
    public static void main(String[] args) {
        Pilha<Integer> PilhaInteiros = new Pilha<>();
        PilhaInteiros.Adicionar(13);
        PilhaInteiros.Adicionar(51);
        PilhaInteiros.Adicionar(1023);
        
        
        System.out.println(PilhaInteiros.remover());
        
        System.out.println("------------------");
        
        Pessoa p1 = new Pessoa("Joao",23);
        Pessoa p2 = new Pessoa("Maria",32);
        Pessoa p3 = new Pessoa("Carlos",18);
        
        Pilha PilhaO = new Pilha();
        
        PilhaO.Adicionar(p1);
        PilhaO.Adicionar(p2);
        PilhaO.Adicionar(p3);
        
        System.out.println(PilhaO.remover() );
        
        
        Pilha<Pessoa> PilhaP = new Pilha();
        
        PilhaP.Adicionar(p1);
        PilhaP.Adicionar(p2);
        PilhaP.Adicionar(p3);
        
        System.out.println(PilhaP.remover().getIdade() );
        
    }
}
