package aulas.colecoes.mapa;
import aulas.colecoes.Pessoa;
import java.util.*;

public class Exemplo2 {
    public static void main(String[] args) {
         Pessoa p1 = new Pessoa("Joao", 19);
        Pessoa p2 = new Pessoa("Maria", 32);
        Pessoa p3 = new Pessoa("Carlos", 23);
        
        Map<String,Pessoa> funcionarios = new HashMap<>();
        funcionarios.put("777.888.999.55", p1);
        funcionarios.put("123.478.456.45", p2);
        funcionarios.put("459.167.747.32", p3);
        
        
        for(String chave:funcionarios.keySet()){
            System.out.println("Chave: "+chave);
            System.out.println(funcionarios.get(chave));
        }
        
    }
       
        
}
