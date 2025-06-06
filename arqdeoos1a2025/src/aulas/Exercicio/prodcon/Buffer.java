package aulas.Exercicio.prodcon;

import java.util.ArrayList;


public class Buffer {
    private ArrayList<Integer> valor;
   private int tamanho;

    public Buffer(int tamanho) {
        valor = new ArrayList<>();

        this.tamanho = tamanho;
    }
   
   
    public synchronized void set(int valor)throws Exception{
        if(this.valor.size()==tamanho){
          
            System.out.println("Tentou escrever no buffer, mas esta ocupado.");
            wait();
        }
        
        this.valor.add(valor);
        
        notifyAll();        
    }
    
    public synchronized int get()throws Exception{
        while(this.valor.isEmpty()){
            System.out.println("Tentou ler, mas o buffer esta vazio");
            wait();
        }
        int aux = valor.get(valor.size()-1);
        valor.remove(valor.size()-1);

        
        
        notifyAll();
        
        return aux;
        
    }
   
   
}
