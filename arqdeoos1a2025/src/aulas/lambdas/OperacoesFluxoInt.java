package aulas.lambdas;

import java.util.stream.IntStream;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Arrays;


public class OperacoesFluxoInt {
    public static void main(String[] args) {
        
    
    int vetor[] = {3,10,6,1,4,8,2,5,9,7};
    
    //Operações stream terminais
    IntStream.of(vetor)
            .forEach((x) -> System.out.println(x));
            
        System.out.println("\n");
        
    System.out.println("Elementos pares do vetor");
    IntStream.of(vetor)
            .forEach((x) -> {
                if( x % 2 == 0){
                    System.out.println(x);
                }
                
            });
            
    System.out.println("\n");
    
    
    int max = IntStream.of(vetor)
            .max().getAsInt();
    
    
    int min = IntStream.of(vetor)
            .min().getAsInt();
    
    
    double avg = IntStream.of(vetor)
            .average().getAsDouble();
    
    
    int sum = IntStream.of(vetor)
            .sum();
    
    
        System.out.printf("max: %d, min: %d, media: %f, soma: %d\n", max, min, avg, sum);
        
        System.out.println("Somatório: " + 
                IntStream.of(vetor)
                .reduce(0, (x,y) ->  x+y));//0 é o valor de X para a primeira chamada do metodod anonimo da expressao lambda definida
        
        System.out.println("Produtório: " + 
                IntStream.of(vetor)
                .reduce(1, (x,y) ->  x*y));//0 é o valor de X para a primeira chamada do metodod anonimo da expressao lambda definida
                
        


        System.out.println("-----------\n");
        
        
        //Operacoes stream intermediarias
        
        System.out.println("Elementos pared do vetor: ");
          IntStream.of(vetor)
             .filter((x) -> x % 2 == 0)
             .sorted()
            .forEach((x) -> System.out.println(x));
            
        System.out.println("\n");
        
        
        System.out.println("Elementos pared do vetor dobrados: ");
          IntStream.of(vetor)
             .filter((x) -> x % 2 == 0)
             .map((x) -> x * 2)      
             .sorted()
            .forEach((x) -> System.out.println(x));
            
        System.out.println("\n");
        
        
        Integer array[] = {3,10,6,1,4,8,2,5,9,7};
        
        List<Integer> paresDobrados = 
                Arrays.stream(array)
                .filter((x) -> x % 2 == 0)
                .map((x) -> x * 2)      
                .sorted()
                .collect(Collectors.toList());
        
        
        System.out.println(paresDobrados);
                
        
        
        
    }
}
