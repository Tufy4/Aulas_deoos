
package aulas.excecoes;


public class Exemplo5 {
    public static void main(String[] args) { //criação do metodo main
        
        Data aniversario = new Data(); //Criação de um objeto Data com o nome aniversario
           
        try{ //Simboliza um bloco que pode vir a lançar exceçoes
            
             aniversario.setDia(-4); //Ele esta alterando o valor do atributo dia
             aniversario.setMes(4); //Ele esta alterando o valor do atributo mes
             aniversario.setAno(2025); //Ele esta alterando o valor do atributo ano
             
        }catch(RuntimeException ex1){ // Ele ira captar todos as Exception que que são "RuntimeException"
            System.out.println(ex1.getMessage());//ele ira printar a mensagem de erro de runtimeException que foi definida na Classe Data
        }catch(Exception ex2){ //Ele ira captar todas as Exception, ou seja seja elas não verificadas ou verificadas, já que Exception é a superclasse de todas excecoes
            System.out.println(ex2.getMessage());//ele ira printar a mensagem de erro de Exception que foi definida na Classe Data
        }
        
        
    }
}
