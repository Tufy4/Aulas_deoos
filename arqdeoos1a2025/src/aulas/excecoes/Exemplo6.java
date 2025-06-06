
package aulas.excecoes;


public class Exemplo6 {
    public static void main(String[] args) { //criação do metodo main
        Data aniversario = new Data(); //Criação de um objeto Data com o nome aniversario
       
        
        
        try{  //Simboliza um bloco que pode vir a lançar exceçoes
             aniversario.setDia(-1); //Ele esta alterando o valor do atributo dia
             aniversario.setMes(4); //Ele esta alterando o valor do atributo mes
             aniversario.setAno(-2025); //Ele esta alterando o valor do atributo ano
             
        }catch(Exception ex){ //Ele ira captar todas as Exception, ou seja seja elas não verificadas ou verificadas, já que Exception é a superclasse de todas excecoes
            System.out.println(ex.getMessage()); //ele ira printar a mensagem de erro de Exception(todas exceções herdam dela) que foi definida na Classe Data
        
        }
        
        
    }
}
