
package aulas.genericos;

public class ClasseB {
    
    public <T> void imprimirVetor (T[] vetor){
        for (T v : vetor) {
            System.out.println(v);
        }
        System.out.println("\n");
    }
    
   
    public <E extends Comparable<E> > E maximo(E valor1,E valor2,E valor3){
        E aux = valor1;
        if(aux.compareTo(valor2)<0){
            aux = valor2;
        }
        if(aux.compareTo(valor3) <0){
            aux = valor3;
        }
        
        return aux;
    }
}
