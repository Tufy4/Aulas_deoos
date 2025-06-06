
package aulas.arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Exemplo4 {
    public static void main(String[] args) {
        File arq = new File("./Arquivo2.txt");
        try{
            FileWriter writer;
                if(arq.exists()==true){
                   writer = new FileWriter(arq,true);
                }  
                else{
                    writer = new FileWriter(arq);
                }     
            
            writer.write("conteudo do Arquivo2.txt\n\n");
            writer.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
