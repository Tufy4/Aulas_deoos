package aulas.colecoes.pilha;
import java.util.*;

public class Exemplo {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack();
        pilha.push("cachorro");
        pilha.push("gato");
        pilha.push("canario");
        System.out.println(pilha);
        
        while(pilha.isEmpty()==false){
            System.out.println(pilha.pop());
        }
    }
}
