package aulas.excecoes;

public class Exemplo2 {
      public static void main(String[] args) { //Criacao do metodo main
        String vetor[] = new String [5];//Criação de um array de Strings
        
        try{//Simboliza um bloco que pode vir a lançar exceçoes
            
            vetor[0] = "IFSP";//Atribuição ao array de Strings
            
          System.out.println(vetor[0].toLowerCase()); //printando o valor da posicao 0 do vetor e deixando em caixa baixa
          
          System.out.println(vetor[1].toLowerCase()); //printando o valor da posicao 1 do vetor e deixando em caixa baixa, dando erro por não haver valor nessa posição

          System.out.println(vetor[5]);//printando o valor da posicao 5 do vetor, dando erro por não haver valor nessa posição
          
        }catch(ArrayIndexOutOfBoundsException ex1){//caso ocorra um erro do tipo 'ArrayIndexOutOfBoundsException', ele ira capturar e executar o que vir abaixo
            System.out.println("A exceção ArrayIndexOutOfBoundsException foi capturada");//caso capte o erro acima ele ira printar essa mensagem
        }
        catch(NullPointerException ex2){//caso ocorra um erro do tipo 'NullPointerException', ele ira capturar e executar o que vir abaixo
            System.out.println(ex2.getMessage());//Ele vai printar a mensagem de erro 'NullPointerException'
            
            ex2.printStackTrace(); //metodo que serve para imprimir a pilha de metodos que foi executada até chegar nessa excecão
        }
        
        
        
          System.out.println(vetor[0]);//printando valor da posicao 0 do vetor
    }
}
