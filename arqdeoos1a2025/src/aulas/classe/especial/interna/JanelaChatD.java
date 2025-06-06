package aulas.classe.especial.interna;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaChatD extends JanelaChat  {

    public JanelaChatD() {
        jButtonApagar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Apagar Mensagem!");
                jTextAreaMensagem.setText("");
                jTextAreaMensagem.requestFocusInWindow();
            }
        });
        
        
        jButtonEnviar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                 System.out.println("Enviar Mensagem!");
        
                String msg = jTextAreaMensagem.getText();

                if(msg.isEmpty() == false){

                    jTextAreaHistorico.append(msg + "\n");
                    jTextAreaMensagem.setText("");
                }


                jTextAreaMensagem.requestFocusInWindow();
            }
        });
    
    
    }
    
    
    
}
