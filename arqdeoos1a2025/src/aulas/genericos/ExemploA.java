
package aulas.genericos;

public class ExemploA {
    public static void main(String[] args) {
        Integer[] vetorInteiros = {13,51,1023};
        Double[] VetorDouble = {1.25,0.75,9.50};
        String[] VetorString = {"Abacaxi","Melão","Melancia"};
        
       ClasseA objA = new ClasseA();
       
       objA.imprimirVetor(vetorInteiros);
       objA.imprimirVetor(VetorDouble);
       objA.imprimirVetor(VetorString);
    }
}
