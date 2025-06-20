
package aulas.threads;


public class Imprimir implements Runnable{
    private int inicio,passo,fim;
    private int delay; //milisegundos

    public Imprimir(int inicio, int passo, int fim, int delay) {
        this.inicio = inicio;
        this.passo = passo;
        this.fim = fim;
        this.delay = delay;
    }

    
    @Override
    public void run() {
        try{
            for(int i = inicio;i<=fim;i+=passo){
                System.out.println("> "+i);
                Thread.sleep(delay);
            } 
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }    
    }
    
    
}
