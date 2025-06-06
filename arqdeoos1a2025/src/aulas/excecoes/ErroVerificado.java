
package aulas.excecoes;


public class ErroVerificado extends Exception{
//Classe filha herdando de um erro verificado
    public ErroVerificado(String mensagem) {
 //construtor criando um objeto de um erro verificado
        super(mensagem);
    }
    
    
}
