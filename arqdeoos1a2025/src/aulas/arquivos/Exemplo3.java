package aulas.arquivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exemplo3 {
    public static void main(String[] args) {
        
        
        File arq1 = new File("./Arquivo1.txt");
        
        try{
            FileReader leitor= new FileReader(arq1);
            BufferedReader buffer =  new BufferedReader(leitor);
            
            
            while (buffer.ready()) {
                
                String linha = buffer.readLine();
                System.out.println(linha);
                
            }
            
            buffer.close();
            leitor.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }
        
       
        
    }
   
}
