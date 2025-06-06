
package revisao;


public class Chave implements Emprestavel{
    

    public Chave(String armario) {
        setArmario(armario);
        setEmprestado(false);
      
    }
    
    
    public String armario;
    public boolean emprestado; 

    public String getArmario() {
        return armario;
    }
    

    public void setArmario(String armario) {
        if(armario.charAt(0)=='A'){
            this.armario = armario;
        }
        
        
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    @Override
    public String getNomeObjeto() {
        return getArmario();
    }

    @Override
    public boolean podeEmprestar() {
        if(emprestado==false){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean emprestar() {
        if(podeEmprestar()){
            setEmprestado(true);
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean devolver() {
        if(emprestado==true){
            setEmprestado(false);
            return true;
        }else{
            return false;
        }
    }
    
    
    
}
