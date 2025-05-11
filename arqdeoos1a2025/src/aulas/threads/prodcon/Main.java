
package aulas.threads.prodcon;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Produtor produtor = new Produtor(buffer, 1500);
        Consumidor consumidor = new Consumidor(buffer, 750);
        
         ExecutorService executorThreads = Executors.newCachedThreadPool();
          
          executorThreads.execute(produtor);
          executorThreads.execute(consumidor);
          
          //Encerra threads trabalhadoras quando suas tarefas terminarem
          executorThreads.shutdown();
        
        
    }
}
