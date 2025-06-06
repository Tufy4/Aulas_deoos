
package aulas.genericos;

import java.util.LinkedList;

public class Pilha <T>{
    private LinkedList<T> lista;

    public Pilha() {
        lista = new LinkedList<>();
    }
    
    public void Adicionar(T valor){
        lista.addFirst(valor);
    }
    public T remover(){
        if(lista.isEmpty()==false){
            return lista.removeFirst();
        }
        else{
            throw new RuntimeException("A fila está vazia");
        }
    }
    
    @Override
    public String toString(){
        return lista.toString();
    }
    
    
    
}
