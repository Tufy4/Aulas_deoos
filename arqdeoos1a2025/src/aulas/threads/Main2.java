
package aulas.threads;

//import java.util.concurrent.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//import java.util.concurrent.Executors;

public class Main2 {
    
    public static void main(String[] args) {
        Fila fila = new Fila(10);
        System.out.println(fila);
        
        Escritor pares = new Escritor(2,2,10,500,fila);
        Escritor impares = new Escritor(1,2,10,1500,fila);
        
        ExecutorService executorThreads = Executors.newCachedThreadPool();

        executorThreads.execute(pares);
        executorThreads.execute(impares);

        //Encerra threads trabalhadoras quando suas tarefas terminarem
        executorThreads.shutdown();
        
        
        try{
            Thread.sleep(15000);
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
        
        
        
        
        System.out.println(fila);
        

    }
}
