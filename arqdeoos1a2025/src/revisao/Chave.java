/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisao;


public class Chave implements Emprestavel {
    public String armario;
    public boolean Emprestado;

    public Chave(String armario){
        this.armario = armario;
        setEmprestado(false);
        
    }

    public void setArmario(String armario) {
        if(armario.charAt(0)=='A'){
            this.armario = armario;
        }
        
    }

    public boolean isEmprestado() {
        return Emprestado;
    }

    public void setEmprestado(boolean Emprestado) {
        this.Emprestado = Emprestado;
    }
    
    
    public String getArmario() {
        return armario;
    }

    

    @Override
    public String getNomeObjeto() {
        return getArmario();
    }

    
    
    
    
    @Override
    public boolean podeEmprestar() {
        if(Emprestado == false){
            return true;
        }else{
            return false;
        }
    }

    
    
    
    
    
    @Override
    public boolean emprestar() {
        if(podeEmprestar()){
            setEmprestado(true);
            return true;
        }else{
            return false;
        }
    }
    
    
    
    

    @Override
    public boolean devolver() {
        if(Emprestado = true){
            setEmprestado(false);
            return true;
        }else{
            return false;
        }
    }
    
    
   
    
}
