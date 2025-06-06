
package aulas.excecoes;


public class ErroNaoVerificado extends RuntimeException{
    //cria uma classe filha de um erro do tipo não verificado (RuntimeException)
    public ErroNaoVerificado(String mensagem) {
        //construtor criando um objeto de um erro não verificado
        super(mensagem);
    }
    
    
}
