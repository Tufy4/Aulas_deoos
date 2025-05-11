
package revisao;


public interface Emprestavel {
    public String getNomeObjeto();
    
    public boolean podeEmprestar();
    
    public boolean emprestar();
    
    public boolean devolver();
}
