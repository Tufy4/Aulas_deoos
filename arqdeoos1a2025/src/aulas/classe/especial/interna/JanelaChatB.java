
package aulas.classe.especial.interna;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaChatB extends JanelaChat{
    
    public JanelaChatB(){
        
        // objeto de uma classe interna
        
        jButtonApagar.addActionListener(new ApagarMensagem());
        
        jButtonEnviar.addActionListener(new EnviarMensagem());
    }
    
    
    
    private class ApagarMensagem implements ActionListener{
         
         public void actionPerformed(ActionEvent ae) {
            System.out.println("Apagar Mensagem!");
            jTextAreaMensagem.setText("");
            jTextAreaMensagem.requestFocusInWindow();
        }
    }
    
    private class EnviarMensagem implements ActionListener{
        
        public void actionPerformed(ActionEvent ae) {
            System.out.println("Enviar Mensagem!");

            String msg = jTextAreaMensagem.getText();

            if(msg.isEmpty() == false){

                jTextAreaHistorico.append(msg + "\n");
                jTextAreaMensagem.setText("");
            }


            jTextAreaMensagem.requestFocusInWindow();
        }
    }
}
