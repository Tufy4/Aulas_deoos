
package aulas.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main1 {
    public static void main(String[] args) {
        Imprimir pares = new Imprimir(0,2,50,500);
        Imprimir impares = new Imprimir(1, 2, 50, 1000);
        
//        pares.run();
//        impares.run();
        
//        Thread thread1 = new Thread(pares);
//        Thread thread2 = new Thread(impares);
//        
//        thread1.start();
//        thread2.start();

        
        ExecutorService executorThreads = Executors.newCachedThreadPool();
        executorThreads.execute(pares);
        executorThreads.execute(impares);
        executorThreads.shutdown();

        System.out.println("Fim da main.");
    }
}
