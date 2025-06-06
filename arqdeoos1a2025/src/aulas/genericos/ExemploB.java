
package aulas.genericos;

import aulas.colecoes.Pessoa;

public class ExemploB {
    public static void main(String[] args) {
        Integer[] vetorInteiros = {13,51,1023};
        Double[] VetorDouble = {1.25,0.75,9.50};
        String[] VetorString = {"Abacaxi","Melão","Melancia"};
        
       ClasseB objB = new ClasseB();
       
       objB.imprimirVetor(vetorInteiros);
       objB.imprimirVetor(VetorDouble);
       objB.imprimirVetor(VetorString);
       
       Pessoa[] vetorPessoas = { new Pessoa("miguel", 23),new Pessoa("tufy", 24),new Pessoa("gustavo", 19)};
       objB.imprimirVetor(vetorPessoas);
       
        System.out.println("--------------");
        
        int valorInteiroMax=objB.maximo(vetorInteiros[0], vetorInteiros[1], vetorInteiros[2]);
        System.out.println(valorInteiroMax);
        
        double valorDoubleMax = objB.maximo(VetorDouble[0], VetorDouble[1], VetorDouble[2]);
        System.out.println(valorDoubleMax);
        
        String valorStringMax = objB.maximo(VetorString[0], VetorString[1], VetorString[2]);
        System.out.println(valorStringMax);
        
        Pessoa PessoaValorMax = objB.maximo(vetorPessoas[0], vetorPessoas[1], vetorPessoas[2]);
        System.out.println(PessoaValorMax);
    }
}
