
package aulas.rede;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.*;

public class Servidor {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String ip = "10.105.68.181";
        int porta = 12345;//0 a 1023 é do SO
        InetAddress endereco = InetAddress.getByName(ip);
        
        ServerSocket servidor = new ServerSocket(porta, 2, endereco);
        System.out.println("Servidor inicializado: "+ servidor);
        
        System.out.println("Espereando por conexao!");
        Socket conexao = servidor.accept();
        System.out.println("Conexao realizada com sucesso");
        
        ObjectOutputStream output = new ObjectOutputStream(conexao.getOutputStream());
        output.flush();
        ObjectInputStream input = new ObjectInputStream(conexao.getInputStream());
        
        
        String mensagem;
        mensagem = "Ola Cliente";
        output.writeObject(mensagem);
        output.flush();
        System.out.println("Mensagem enviada " + mensagem);
        
        mensagem = (String) input.readObject();
        System.out.println("Mensagem recebida " + mensagem);
        
        output.close();
        input.close();
        conexao.close();
             
    }
}
