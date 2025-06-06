package aulas.arquivos;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exemplo2 {
    public static void main(String[] args) {
        
        
        File arq1 = new File("./Arquivo1.txt");
        
        try{
            FileReader leitor= new FileReader(arq1);
            
            while (leitor.ready()) {
                char letra = (char) leitor.read();
                System.out.println(letra);
                
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }
        
       
        
    }
   
}
