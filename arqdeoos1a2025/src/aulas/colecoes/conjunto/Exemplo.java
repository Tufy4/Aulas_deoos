package aulas.colecoes.conjunto;
import java.util.*;

public class Exemplo {
    public static void main(String[] args) {
        
        Set<String> conjunto = new TreeSet<>();
        conjunto.add("cachorro");
        conjunto.add("gato");
        conjunto.add("canario");
        conjunto.add("canario");
        
        System.out.println(conjunto);
    }
}
