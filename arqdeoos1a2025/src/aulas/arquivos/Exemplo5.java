package aulas.arquivos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Exemplo5 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Miguel","516.438.378-00");
        Pessoa p2 = new Pessoa("teste","321.431.347-00");
        
        System.out.println(p1); 
        System.out.println(p2); 
        
     File arq = new File("./Arquivo4.ser");   
     try{
         FileOutputStream stream = new FileOutputStream(arq);
         
         ObjectOutputStream output = new ObjectOutputStream(stream);
         
         output.writeObject(p1);
         output.writeObject(p2);
         
         output.close();
         stream.close();
         
     }catch(IOException ex){
         ex.printStackTrace();
     }
    }
}
