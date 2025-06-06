package aulas.excecoes;

public class Exemplo1 {
      public static void main(String[] args) {
      //criação do metodo main
          
        String vetor[] = new String [5]; //criação de um vetor de Strings de tamanho 5
        vetor[0] = "IFSP";//Atribuição de valor ao vetor
        
          System.out.println(vetor[0].toLowerCase()); //printando o valor da posicao 0 do vetor e deixando em caixa baixa
          System.out.println(vetor[1].toLowerCase());//printando valor da posicao 1 do vetor e deixando em caixa baixa, dando erro por nao ter valor nessa posicao
         System.out.println(vetor[0]);//printando o valor da posicao 0 do vetor 
          System.out.println(vetor[5]);//printando o valor da posicao 5 do vetor,dando erro por não ter valor nessa posicao
         
    }
}
