
package aulas.exececoes;


public class ErroNaoVerificado extends RuntimeException{
    public ErroNaoVerificado(String mensagem){
        super(mensagem);
    }
}
