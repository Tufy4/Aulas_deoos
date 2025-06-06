package aulas.colecoes.mapa;
import java.util.*;

public class Exemplo {
    public static void main(String[] args) {
        Map<String,Double> notas = new HashMap<>();
        
        notas.put("Joao", 5.5);
        notas.put("Maria", 1.5);
        notas.put("Carlos", 1.5);
    
        System.out.println(notas);
        
        double valor = notas.get("Joao");
        
        System.out.println("João: "+valor);
    }
}
