
package aulas.rede;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.*;


public class Cliente {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String ip = "10.105.68.180";
        int porta = 12345;//0 a 1023 é do SO
        InetAddress endereco = InetAddress.getByName(ip);
        
        Socket conexao = new Socket(endereco, porta);
        System.out.println("Conexao realizada com sucesso");
        
        ObjectOutputStream output = new ObjectOutputStream(conexao.getOutputStream());
        output.flush();
        ObjectInputStream input = new ObjectInputStream(conexao.getInputStream());
        
        String mensagem = (String) input.readObject();
        System.out.println("Mensagem recebida " + mensagem);
        
        mensagem = "Ola servidor";
        output.writeObject(mensagem);
        output.flush();
        System.out.println("Mensagem enviada " + mensagem);
        
        output.close();
        input.close();
        conexao.close();
    }
}
