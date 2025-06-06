
package aulas.rede;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static java.lang.System.out;
import java.net.*;

public class Servidor{
    
    public static void main(String[] args) throws Exception{
         String ip = "10.105.68.180";
         int porta = 12345;
    
        InetAddress endereco = InetAddress.getByName(ip);
    
    
    ServerSocket servidor = new ServerSocket(porta,2,endereco);
        System.out.println("Servidor inicializado: "+servidor);
        System.out.println("Esperando por conexão");
        Socket conexao = servidor.accept();
        System.out.println("Conexao realizada com sucesso");
        
         ObjectOutputStream output;
        output = new ObjectOutputStream(conexao.getOutputStream());
        output.flush();
        
        ObjectInputStream input;
        input = new ObjectInputStream(conexao.getInputStream());
        
        String mensagem="ola GUSTAVO";
        output.writeObject(mensagem);
        output.flush();
        System.out.println("Mensagem enviada: "+mensagem);
        
        mensagem = (String) input.readObject();
        System.out.println("Mensagem recebida: "+mensagem);
        
        output.close();
        input.close();
        conexao.close();
    }
   
    
}
