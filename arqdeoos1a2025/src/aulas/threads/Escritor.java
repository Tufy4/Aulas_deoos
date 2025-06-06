
package aulas.threads;


public class Escritor implements Runnable{
    private int inicio,passo,fim;
    private int delay; //milisegundos
    private Fila fila;

    public Escritor(int inicio, int passo, int fim, int delay,Fila fila) {
        this.inicio = inicio;
        this.passo = passo;
        this.fim = fim;
        this.delay = delay;
        this.fila = fila;
    }

    
    @Override
    public void run() {
       
            for(int i = inicio;i<=fim;i+=passo){
               fila.adicionar(i, delay);
            } 
       
    }
    
    
}
