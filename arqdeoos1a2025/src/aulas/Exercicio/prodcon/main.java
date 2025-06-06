package aulas.Exercicio.prodcon;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(5);
        Produtor produtor = new Produtor(buffer, 100);
        Consumidor consumidor = new Consumidor(buffer, 750);
        
        ExecutorService executorThreads = Executors.newCachedThreadPool();
        executorThreads.execute(produtor);
        executorThreads.execute(consumidor);
        executorThreads.shutdown();
    }
}
