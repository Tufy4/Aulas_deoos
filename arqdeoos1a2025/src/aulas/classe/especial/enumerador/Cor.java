
package aulas.classe.especial.enumerador;

public enum Cor {
    
    VERMELHO("VERMELHO","#FF0000"),
    AZUL("AZUL","#0000FF"),
    VERDE("VERDE","#00FF00"),
    BRANCO("BRANCO","#FFFFFF"),
    PRETO("PRETO","#000000");
    
    private String nome;
    private String codigo;
    
    private Cor(String nome,String codigo){
        setNome(nome);
        setCodigo(codigo);
    }

    
    
    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        if(nome!=null){
            this.nome = nome;
        }else throw new IllegalArgumentException("O nome não pode ser nulo");
    }

    public String getCodigo() {
        return codigo;
    }

    private void setCodigo(String codigo) {
        
        if(codigo!=null && codigo.matches("#([a-fA-F0-9]){6}")){
            this.codigo = codigo;
        }else throw new IllegalArgumentException("O codigo deve ser o codigo de uma cor "
                + "hexadecimal válida!");
    }

    @Override
    public String toString() {
        return getNome()+ " ("+getCodigo()+ ")";
    }
    
       
}
