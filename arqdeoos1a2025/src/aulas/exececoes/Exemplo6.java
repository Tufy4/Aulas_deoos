
package aulas.exececoes;


public class Exemplo6 {
    public static void main(String[] args){
        Data niver = new Data();
        
      
        
        try{
             niver.setDia(-4);
             niver.setMes(04);
             niver.setAno(2025);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
       
        
    }
}
