
package aulas.colecoes.fila;
import java.util.*;

public class Exemplo {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<String>();
        fila.offer("cachorro");
        fila.offer("gato");
        fila.offer("canario");
        
        while(fila.isEmpty() == false){
            System.out.println(fila.poll());
        }
    }
}
